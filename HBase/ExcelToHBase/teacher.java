import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;

public class teacher {
	public static Configuration configuration;
	public static Connection connection;
	public static Admin admin;
	private static FormulaEvaluator evaluator;

	public static void main(String[] args) throws Exception {
		//连接HBase
		init();
		// 读取HBaseData.xlsx表格数据,创建表并写入数据
		ETHBase();
		
		//从HBase获取表的全部数据并打印
		FromHBase();
		
		//关闭HBase
		close();

	}
	
	//从HBase获取表的全部数据并打印
	public static void FromHBase() {
		int rowkey = 0;
		int count = 1;
		String colfam = "tinfo";
		String col[] = { "tname", "tsex", "subject" };
		int j = 0;
		for (int i = 2; i < 22; i++) {
			for (int o = 0; o < 3; o++) {
				rowkey = -1 + i;
				String rowkey1="";
				if(rowkey<10) {
				rowkey1 = "t000"+rowkey ;}
				if(rowkey>=10) {
				rowkey1 = "t00"+rowkey ;
				}

				if (count == 3) {
					colfam = "tsubject";
				} else if (count == 4) {
					colfam = "tinfo";
					count = 1;
				}

				try {
					getData("teacher", rowkey1, colfam, col[j]);
					System.out.println("  =>" + colfam + ":" + col[j]);
				} catch (Exception e) {
					System.out.print("");
				}
				j++;
				if (j == 3) {
					j = 0;
				}
				count++;

			}

			System.out.println();
			System.out.println("=================");
			System.out.println();
		}
	}

	// 读取HBaseData.xlsx表格数据,创建表并写入数据
	public static void ETHBase() throws Exception, IOException {
		InputStream inp = new FileInputStream("/home/hwy/HBaseData.xlsx");
		Workbook wb = WorkbookFactory.create(inp);
		Sheet sheet = wb.getSheetAt(1);
		evaluator = wb.getCreationHelper().createFormulaEvaluator();
		createTable("teacher", new String[] { "tinfo", "tsubject" });
		int rowkey = 0;
		int count = 1;
		String colfam = "tinfo";
		String col[] = { "tname", "tsex", "subject" };
		for (int i = 2; i < 22; i++) {
			rowkey = -1 + i;
			String rowkey1="";
			if(rowkey<10) {
			rowkey1 = "t000"+rowkey ;}
			if(rowkey>=10) {
			rowkey1 = "t00"+rowkey ;
			}
			int j = 0;
			Row row = sheet.getRow(i);
			for (Cell cell : row) {
				if (getCellValueByCell(cell).equals(rowkey1)) {
					continue;
				}
				if (count == 3) {
					colfam = "tsubject";
				} else if (count == 4) {
					colfam = "tinfo";
					count = 1;
				}

				if (!getCellValueByCell(cell).equals("")) {
					insertData("teacher", rowkey1, colfam, col[j], getCellValueByCell(cell));
				}
				j++;
				if (j == 3) {
					j = 0;
				}
				count++;
			}
		}
		System.out.println("Excel表格数据写入HBase成功！");
		inp.close();
	}
	// 获取单元格各类型值，返回字符串类型
	private static String getCellValueByCell(Cell cell) {
		// 判断是否为null或空串
		if (cell == null || cell.toString().trim().equals("")) {
			return "";
		}
		String cellValue = "";
		int cellType = cell.getCellType();
		if (cellType == Cell.CELL_TYPE_FORMULA) { // 表达式类型
			cellType = evaluator.evaluate(cell).getCellType();
		}

		switch (cellType) {
		case Cell.CELL_TYPE_STRING: // 字符串类型
			cellValue = cell.getStringCellValue().trim();
			cellValue = StringUtils.isEmpty(cellValue) ? "" : cellValue;
			break;
		case Cell.CELL_TYPE_BOOLEAN: // 布尔类型
			cellValue = String.valueOf(cell.getBooleanCellValue());
			break;
		case Cell.CELL_TYPE_NUMERIC: // 数值类型
			cellValue = new DecimalFormat("######").format(cell.getNumericCellValue());
			break;

		default: // 其它类型，取空串吧
			cellValue = "";
			break;
		}
		return cellValue;
	}
//连接HBase
	public static void init() {
		configuration = HBaseConfiguration.create();
		configuration.set("hbase.rootdir", "192.168.10.100:9000");
		try {
			connection = ConnectionFactory.createConnection(configuration);
			admin = connection.getAdmin();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//关闭HBase
	public static void close() {
		try {
			if (admin != null) {
				admin.close();
			}
			if (null != connection) {
				connection.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//创建HBase表
	public static void createTable(String myTableName, String[] colFamily) throws IOException {

		if (admin.tableExists(TableName.valueOf(myTableName))) {
			System.out.println("talbe is exists!");
		} else {
			// 3.创建表描述器
			HTableDescriptor hTableDescriptor = new HTableDescriptor(TableName.valueOf(myTableName));

			// 4.循环添加列族信息
			for (String cf : colFamily) {

				// 5.创建列族描述器
				HColumnDescriptor hColumnDescriptor = new HColumnDescriptor(cf);

				// 6.添加具体的列族信息
				hTableDescriptor.addFamily(hColumnDescriptor);

			}
			admin.createTable(hTableDescriptor);
			System.out.println("表格创建成功");
		}	
	}
//将数据写入HBase数据库
	public static void insertData(String tableName, String rowKey, String colFamily, String col, String val)
			throws IOException {
		Table table = connection.getTable(TableName.valueOf(tableName));
		Put put = new Put(rowKey.getBytes());
		put.addColumn(colFamily.getBytes(), col.getBytes(), val.getBytes());
		table.put(put);
		table.close();
	}
//获取HBase数据
	public static void getData(String tableName, String rowKey, String colFamily, String col) throws IOException {
		Table table = connection.getTable(TableName.valueOf(tableName));
		Get get = new Get(rowKey.getBytes());
		get.addColumn(colFamily.getBytes(), col.getBytes());
		Result result = table.get(get);
		System.out.print(new String(result.getValue(colFamily.getBytes(), col == null ? null : col.getBytes())));
		table.close();
	}
}
