

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;





class Node<T>{
	public T data;
	public Node<T> next;
	public Node(T data,Node<T> next) {
		this.data=data;
		this.next=next;
	}
	public Node() {
		this(null,null);
	}
	public String toString() {
		return this.data.toString();
	}
}

class SinglyList<T> extends Object {
	int search=0;
	int panduan=0;
	static String abc[]= {"aaa","bbb"};
	public Node<T> head;
	public SinglyList() {
		this.head=new Node<T>();
	}
	public SinglyList(T[] values) {
		this();
		Node<T> rear=this.head;
		for(int i=0;i<values.length;i++) {
			if(values[i]!=null) {
				rear.next=new Node<T>(values[i],null);
				rear=rear.next;
			}
		}
	}
	public boolean isEmpty() {
		return this.head.next==null;
	}
	public T get(int i) {
		Node<T> p=this.head.next;
		for(int j=0;p!=null && j<i;j++) {
			p=p.next;
		}
		return(i>=0&&p!=null)?p.data:null;
	}
	public void set(int i,T x) {
		
	}
	public int size() {
		int sum=0;
		for(Node<T> p=this.head.next;p!=null;p=p.next) {
			sum++;
		}
		return sum;
		
	}
	public String toString() {
		String str="";
		for(Node<T> p=this.head.next;p!=null;p=p.next) {
			if(p.next!=null) {
			str+= p.data.toString()+"\n";}
			else if(p.next==null) {
				str+= p.data.toString();}
		}
		return str;
	}
	public Node<T> insert(int i,T x){
		if(x==null) {
			return null;
		}
		Node<T> front=this.head;
		for(int j=0;front.next!=null&&j<i;j++) {
			front=front.next;
		}
		front.next=new Node<T>(x,front.next);
		return front.next;
	}
	public Node<T> insert(T x){
		return insert(Integer.MAX_VALUE,x);
	}
	public T remove(int i) {
		Node<T> front=this.head;
		for(int j=0;front.next!=null&&j<i;j++) {
			front=front.next;
			
		}
		if(i>=0&&front.next!=null) {
			T x=front.next.data;
			front.next=front.next.next;
			return x;
		}
		return null;
	}
	
	public void clear() {
		this.head.next=null;
	}
	public String search(String[] key){
		search=0;
		String jieguo="";
		Node<String> front=(Node<String>) this.head;
		Node<String> kaishi=null;
		while(true) {
			
			kaishi=front.next;
			
		for(front=kaishi;front!=null;front=front.next) {
			search++;
			if(front==null) {
				
				break;
			}
			
			if(front.data.contains(key[0])) {
				if(front.data.contains(key[1])) {
					if(front.data.contains(key[2])) {
						
						break;
					}
					else {
						continue;
					}
				}
				else {
					continue;
				}
				
			}
			else {
				continue;
				
			}
			
		}
		if(kaishi==null||front==null) {
			System.out.println("没有此元素");
			break;
			
		}
		else {
			jieguo=jieguo+","+(search-1);
		}}
		return jieguo;
		
	}
	public T update(T key,int i) {
		Node<T> front=this.head;
		for(int j=0;j<i;j++) {
			front=front.next;
		}
		if(i==0) {
			front.data=null;
			return front.data;
		}
		else {
		front.data=key;
		return front.data;
		
	}}

	
	

}

public class shugou {

	public static void main(String[] args) {
			String zhunbeixinxi="\t账号\t密码\n\tbanzhang\tbanzhang\n\txuewei\txuewei\n\tjilv\tjilv\n\txiaohong\n\txiaohuang\n\txiaohei\n\txiaolan\n\txiaolv\n\txiaoqiang\n\txiaoming\n\txiaoqi\n\txiaobai\n\txiaoxiao\n";
			File file1=new File("zhunbeixinxi.txt");
			if(!file1.exists()) {
				try {
					file1.createNewFile();
					FileWriter fw=new FileWriter(file1);
					fw.write(zhunbeixinxi);
					fw.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			
			
			String xingmingzhanghao="\t账号\t\t姓名\n\tbanzhang\t班长\n\txuewei\t\t学委\n\tjilv\t\t纪律委员\n\txiaohong\t小红\n\txiaohuang\t小黄\n\txiaohei\t\t小黑\n\txiaolan\t\t小蓝\n\txiaolv\t\t小绿\n\txiaoqiang\t小强\n\txiaoming\t小明\n\txiaoqi\t\t小奇\n\txiaobai\t\t小白\n\txiaoxiao\t小小\n";
			File file3=new File("xingmingzhanghao.txt");
			if(!file3.exists()) {
				try {
					file3.createNewFile();
					FileWriter fw=new FileWriter(file3);
					fw.write(xingmingzhanghao);
					fw.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			
			
			
			
	
			String zhunbeijilu="\t编号\t\t学号\t\t姓名\t\t日期\t\t地点\t\t当天第几节课\t\t性质\n\t1\t\t2019101111\t小红\t\t20210101\t教室\t\t当天第1节课\t\t迟到\n\t2\t\t2019101112\t小黄\t\t20210102\t教室\t\t当天第2节课\t\t迟到\n\t3\t\t2019101113\t小黑\t\t20210101\t教室\t\t当天第1节课\t\t缺席\n\t4\t\t2019101114\t小明\t\t20210104\t教室\t\t当天第1节课\t\t迟到\n\t5\t\t2019101115\t小蓝\t\t20210105\t教室\t\t当天第1节课\t\t请假\n\t6\t\t2019101116\t小强\t\t20210101\t操场\t\t当天第3节课\t\t迟到\n\t7\t\t2019101117\t小白\t\t20210106\t教室\t\t当天第5节课\t\t迟到\n\t8\t\t2019101118\t小小\t\t20210101\t操场\t\t当天第1节课\t\t缺席\n\t9\t\t2019101119\t小绿\t\t20210101\t教室\t\t当天第2节课\t\t迟到\n\t10\t\t2019101120\t小黑\t\t20210107\t教室\t\t当天第1节课\t\t缺席";
			File file2=new File("zhunbeijilu.txt");
			if(!file2.exists()) {
				try {
					file2.createNewFile();
					FileWriter fw=new FileWriter(file2);
					fw.write(zhunbeijilu);
					fw.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			denglu a=new denglu();
			a.setVisible(true);
//		String []abc= {"1234","1111124","2421222335"};
//		SinglyList a=new SinglyList(abc);
//		String []c= {"1","5","4"};
//		a.search(c);
		
	}

}






 class SeqList<T>{
	final static int maxSize=64;
	protected T[] listArray;
	protected int length;
	
	public SeqList() {
		this(maxSize);
		length=0;
		listArray=(T[])new Object[maxSize];
	}
	public SeqList(int n) {
		if(n<=0) {
			System.out.println("error");
			System.exit(1);
		}
		length=0;
		listArray=(T[])new Object[n];
	}
	public SeqList(T[] values) {
		length=values.length;
		listArray=(T[])new Object[maxSize];
		for(int i=0;i<values.length;i++) {
			listArray[i]=values[i];
		}
	}
	public boolean isEmpty() {
		return length==0;   
		
	}
	public int size() {
		return length;
		
	}
	public boolean add(T obj,int pos) {
		if(pos<1||pos>length+1) {
			System.out.println("pos值不合法");
			return false;}
			for(int i=length;i>=pos;i--) {
				listArray[i]=listArray[i-1];
			}
			listArray[pos-1]=obj;
			length++;
			return true;
		
		
	}
	public T delete(int pos) {
		return null;
		
	}
	public int find(String obj) {
		if(isEmpty()) {
			System.out.println("顺序表为空");
			return -1;
		}
		else {
			for(int i=0;i<length;i++) {
				String a=(String)listArray[i];
				
				if(a.contains(obj)) {
					return (i+1);
				}
				
			}
		}
		return -1;
		
	}
	public T value(int pos) {
		if(isEmpty( )){
			System.out.println("顺序表为空");
			return null;
		}
		else{
		     if(pos<1||pos>length){		 		   
		        System.out.println("pos值不合法");
		        return null;}
			return listArray[pos-1];		
		}    	    
		
	}
	public T remove(int pos) {
		T x=listArray[pos-1];
		for(int i=pos;i<=length;i++) {
			listArray[i-1]=listArray[i];
			
		}
		length--;
		return x;
	}
	public boolean modify(T obj,int pos){
		if(isEmpty( )){
			System.out.println("顺序表为空");
			return false;
		}
	    	else{
	    		if(pos<1||pos>length){
	        			System.out.println("error");
	        			return false;
	        	}
	        	listArray[pos-1]=obj; 
	        	return true;  
	        	
	    	}   
		
	}
	public void nextOrder(  ) 
	{
	    	for(int i=0;i<length;i++) {
	    		System.out.println(listArray[i]);
	    		
	    	}
	}
	
	
	
}




class denglu extends JFrame{
	public denglu() {
		Container container=getContentPane();
		setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container.setLayout(new BorderLayout());
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		container.add(jp1,BorderLayout.NORTH);
		container.add(jp2,BorderLayout.CENTER);
		container.add(jp3,BorderLayout.SOUTH);
		JLabel jl1=new JLabel("用户登录");
		jl1.setFont(new Font("宋体",Font.BOLD,25));
		
		jp1.setLayout(new BorderLayout());
		jp1.add(jl1,BorderLayout.CENTER);
		jl1.setBorder(BorderFactory.createEmptyBorder(25,135,0,0));
jp2.setLayout(null);
		
		
		
		JLabel jl2=new JLabel("账号");
		JLabel jl3=new JLabel("密码");
		

		jp2.add(jl2);
		jp2.add(jl3);
		
		JTextField jt1=new JTextField(20);
		JPasswordField jpass=new JPasswordField();
		jp2.add(jt1);
		jp2.add(jpass);
		jl2.setBounds(60, 10, 50, 50);
		jl3.setBounds(60, 60, 50, 50);
		jl2.setFont(new Font("宋体", Font.BOLD, 20));
		jl3.setFont(new Font("宋体", Font.BOLD, 20));
		jt1.setBounds(115, 20, 200, 30);
		jpass.setBounds(115, 70, 200, 30);
		
		

		ButtonGroup group=new ButtonGroup();
		
		jp3.setLayout(new GridLayout(2, 1));
		JPanel jp31=new JPanel();
		JPanel jp32=new JPanel();
		jp3.add(jp31);
		jp3.add(jp32);
		
		JButton jb1=new JButton("登录");
		JButton jb2=new JButton("注册");
		jb1.setFont(new Font("宋体", Font.BOLD, 15));
		jb2.setFont(new Font("宋体", Font.BOLD, 15));
		jp32.add(jb1);
		jp32.add(jb2);
		jb1.setPreferredSize(new Dimension(150,35));
		jb2.setPreferredSize(new Dimension(150,35));
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				zhuce a=new zhuce();
				a.setVisible(true);
			}
		});
		
		jb1.addActionListener(new ActionListener() {
			String xinxi="";
			@Override
			public void actionPerformed(ActionEvent e) {
				String zhanghao=jt1.getText();
				char ch[]=jpass.getPassword();
				String mima=new String(ch);
				File file1 =new File("zhunbeixinxi.txt");
				
				try {
					FileReader fr=new FileReader(file1);
					char[] linshi2=new char[1024];
					int hasread=-1;
					while((hasread=fr.read(linshi2))!=-1) {
						 xinxi=new String(linshi2,0,hasread);
					}
					fr.close();
				} catch (FileNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				String xinxi2=xinxi;
				String xinxi3[]=xinxi2.split("\n");
				SeqList<String> a=new SeqList(xinxi3);
				
				if(zhanghao.equals("banzhang")) {
					if(mima.equals("banzhang")) {
						gongneng1 b=new gongneng1();
						b.setVisible(true);
						setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null,"密码错误","登陆失败",JOptionPane.WARNING_MESSAGE);

					}
				}
				
				else if(zhanghao.equals("xuewei")) {
					if(mima.equals("xuewei")) {
						gongneng1 b=new gongneng1();
						b.setVisible(true);
						setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null,"密码错误","登陆失败",JOptionPane.WARNING_MESSAGE);

					}
				}
				
				else if(zhanghao.equals("jilv")) {
					if(mima.equals("jilv")) {
						gongneng1 b=new gongneng1();
						b.setVisible(true);
						setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null,"密码错误","登陆失败",JOptionPane.WARNING_MESSAGE);

					}
				}
				
				
				
				else if(a.find(zhanghao)!=-1) {
					String xuanze=a.value(a.find(zhanghao));
					int num1=xuanze.indexOf(zhanghao);
					int num2=xuanze.length();
					String bufen=xuanze.substring(num1, num2);
					if(bufen.contains("\t")) {
						int num3=xuanze.indexOf("\t", num1)+1;
						String mima2=xuanze.substring(num3, num2);
						
						if(mima2.equals(mima)) {
							gongneng2 c=new gongneng2();
							c.setVisible(true);
							setVisible(false);
						}
						else {
							JOptionPane.showMessageDialog(null,"密码错误","登陆失败",JOptionPane.WARNING_MESSAGE);

						}
					}
					else {
						JOptionPane.showMessageDialog(null,"账号尚未注册","账号未注册",JOptionPane.WARNING_MESSAGE);

					}
				}
				else {
					JOptionPane.showMessageDialog(null,"此账号不存在","账号不存在",JOptionPane.WARNING_MESSAGE);

				}
				
			}
		});
		
		
	}
}

class zhuce extends JFrame{
	public zhuce() {
		Container container=getContentPane();
		setBounds(100,100,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container.setLayout(new BorderLayout());
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		
		container.add(jp1,BorderLayout.NORTH);
		container.add(jp2,BorderLayout.CENTER);
		
		JLabel jl1=new JLabel("用户注册");
		jl1.setFont(new Font("宋体",Font.BOLD,25));
		
		jp1.setLayout(new BorderLayout());
		jp1.add(jl1,BorderLayout.CENTER);
		jl1.setBorder(BorderFactory.createEmptyBorder(25, 135, 0, 0));
		jp2.setLayout(null);
		
		
		
		JLabel jl2=new JLabel("账号");
		JLabel jl3=new JLabel("密码");
		

		jp2.add(jl2);
		jp2.add(jl3);
		
		JTextField jt1=new JTextField(20);
		JPasswordField jpass=new JPasswordField();
		jp2.add(jt1);
		jp2.add(jpass);
		jl2.setBounds(60, 10, 50, 50);
		jl3.setBounds(60, 60, 50, 50);
		jl2.setFont(new Font("宋体", Font.BOLD, 20));
		jl3.setFont(new Font("宋体", Font.BOLD, 20));
		jt1.setBounds(115, 20, 200, 30);
		jpass.setBounds(115, 70, 200, 30);
		
		JButton jb1=new JButton("注册");
		jp2.add(jb1);
		jb1.setPreferredSize(new Dimension(250,35));
		jb1.setBounds(95, 130, 200, 40);
		jb1.setFont(new Font("宋体", Font.BOLD, 20));
		
		jb1.addActionListener(new ActionListener() {
			String xinxi;
			@Override
			public void actionPerformed(ActionEvent e) {
				File file1 =new File("zhunbeixinxi.txt");
				
				try {
					FileReader fr=new FileReader(file1);
					char[] linshi2=new char[1024];
					int hasread=-1;
					while((hasread=fr.read(linshi2))!=-1) {
						 xinxi=new String(linshi2,0,hasread);
					}
					fr.close();
				} catch (FileNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				String xinxi2=xinxi;
				String xinxi3[]=xinxi2.split("\n");
				SeqList<String> a=new SeqList(xinxi3);
				String zhanghao=jt1.getText();
				int i=a.find(zhanghao);
				if(i==-1) {
					JOptionPane.showMessageDialog(null,"此用户不存在","注册失败",JOptionPane.WARNING_MESSAGE);
				}
				else {
					String a1=a.value(i);
					
					int num1=a1.indexOf(zhanghao);
					int num2=a1.length();
					String a2=a1.substring(num1, num2);
					if(a2.contains("\t")) {
						JOptionPane.showMessageDialog(null,"此用户已经注册过，无需再注册","已注册",JOptionPane.WARNING_MESSAGE);
					}
					else {
						char ch[]=jpass.getPassword();
						String mima2=new String(ch);
						
						if(mima2.equals("")) {
							JOptionPane.showMessageDialog(null,"请输入密码","密码未输入",JOptionPane.WARNING_MESSAGE);
						}
						else {
						String wanzheng="\t"+zhanghao+"\t"+mima2;
						a.modify(wanzheng, i);
						
						String xinxinxi="";
						
						for(int o=1;o<=a.length;o++) {
							 xinxinxi=xinxinxi+a.value(o)+"\n";
						}
						File file2=new File("zhunbeixinxi.txt");
						
							
								
								FileWriter fw;
								try {
									fw = new FileWriter(file2);
									fw.write(xinxinxi);
									fw.close();
								} catch (IOException e1) {
									// TODO 自动生成的 catch 块
									e1.printStackTrace();
								}
						JOptionPane.showMessageDialog(null,"注册成功","注册成功",JOptionPane.WARNING_MESSAGE);
						setVisible(false);
							
					}}
					
				}
				
				
				
				
			}
		});
	}
}

class gongneng1 extends JFrame{
	public gongneng1() {
		Container container=getContentPane();
		setTitle("考勤管理系统");
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container.setLayout(new GridLayout(2, 3));
		JButton jb1=new JButton("添加");
		JButton jb2=new JButton("删除");
		JButton jb3=new JButton("修改");
		JButton jb4=new JButton("查询和统计");
		JButton jb5=new JButton("查看所有记录");
		JButton jb6=new JButton("查看全部人员");

		container.add(jb1);
		container.add(jb2);
		container.add(jb3);
		container.add(jb4);
		container.add(jb5);
		container.add(jb6);
		
		jb1.setFont(new Font("宋体", Font.BOLD, 30));
		jb2.setFont(new Font("宋体", Font.BOLD, 30));
		jb3.setFont(new Font("宋体", Font.BOLD, 30));
		jb4.setFont(new Font("宋体", Font.BOLD, 30));
		jb5.setFont(new Font("宋体", Font.BOLD, 25));
		jb6.setFont(new Font("宋体", Font.BOLD, 25));
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tianjia a=new tianjia();
				a.setVisible(true);
			}
		});
		
		jb6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				chakanrenyuan a=new chakanrenyuan();
				a.setVisible(true);
			}
		});
		
		jb5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				chakanjilu a=new chakanjilu();
				a.setVisible(true);
				
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				shanchu a=new shanchu();
				a.setVisible(true);
			}
		});
		
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				xiugai a=new xiugai();
				a.setVisible(true);
			}
		});
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chaxun a=new chaxun();
				a.setVisible(true);
			}
		});

	}
}

class gongneng2 extends JFrame{
	public gongneng2() {
		Container container=getContentPane();
		setTitle("考勤管理系统");
		setBounds(100, 100, 600, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container.setLayout(new GridLayout(1, 3));

		JButton jb1=new JButton("查询和统计");
		JButton jb2=new JButton("查看所有记录");
		JButton jb3=new JButton("查看全部人员");

		container.add(jb1);
		container.add(jb2);
		container.add(jb3);


		
		jb1.setFont(new Font("宋体", Font.BOLD, 30));
		jb2.setFont(new Font("宋体", Font.BOLD, 25));
		jb3.setFont(new Font("宋体", Font.BOLD, 25));
		
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				chakanrenyuan a=new chakanrenyuan();
				a.setVisible(true);
				
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				chakanjilu a=new chakanjilu();
				a.setVisible(true);
				
			}
		});
		
jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chaxun a=new chaxun();
				a.setVisible(true);
			}
		});


	}
}

class tianjia extends JFrame{
	public tianjia() {
		Container container=getContentPane();
		setTitle("添加记录");
		setBounds(100, 100, 600, 290);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		container.setLayout(null);
		
		JLabel jl1=new JLabel("学号：");
		JLabel jl2=new JLabel("姓名：");
		JLabel jl3=new JLabel("日期：");
		JLabel jl4=new JLabel("地点：");
		JLabel jl5=new JLabel("第几节课：");
		JLabel jl6=new JLabel("性质：");
		JLabel li1=new JLabel("(例：2019101111)");
		JLabel li2=new JLabel("(例：黄XX)");
		JLabel li3=new JLabel("(例：20210101)");
		JLabel li4=new JLabel("(选填：教室/操场)");
		JLabel li5=new JLabel("(例：1)");
		JLabel li6=new JLabel("(选填：迟到/缺席/请假)");
		
		JTextField jt1=new JTextField();
		JTextField jt2=new JTextField();
		JTextField jt3=new JTextField();
		JTextField jt4=new JTextField();
		JTextField jt5=new JTextField();
		JTextField jt6=new JTextField();

		container.add(jl1);
		container.add(jl2);
		container.add(jl3);
		container.add(jl4);
		container.add(jl5);
		container.add(jl6);
		container.add(jt1);
		container.add(jt2);
		container.add(jt3);
		container.add(jt4);
		container.add(jt5);
		container.add(jt6);
		container.add(li1);
		container.add(li2);
		container.add(li3);
		container.add(li4);
		container.add(li5);
		container.add(li6);
		
		jl1.setFont(new Font("宋体", Font.BOLD, 20));
		jl2.setFont(new Font("宋体", Font.BOLD, 20));
		jl3.setFont(new Font("宋体", Font.BOLD, 20));
		jl4.setFont(new Font("宋体", Font.BOLD, 20));
		jl5.setFont(new Font("宋体", Font.BOLD, 20));
		jl6.setFont(new Font("宋体", Font.BOLD, 20));
		li1.setFont(new Font("宋体", Font.BOLD, 15));
		li2.setFont(new Font("宋体", Font.BOLD, 15));
		li3.setFont(new Font("宋体", Font.BOLD, 15));
		li4.setFont(new Font("宋体", Font.BOLD, 15));
		li5.setFont(new Font("宋体", Font.BOLD, 15));
		li6.setFont(new Font("宋体", Font.BOLD, 15));

		
		
		jl1.setBounds(20, 20, 100, 50);
		jl2.setBounds(200, 20, 100, 50);
		jl3.setBounds(380, 20, 100, 50);
		jl4.setBounds(20, 100, 100, 50);
		jl5.setBounds(200, 100, 120, 50);
		jl6.setBounds(380, 100, 100, 50);
		jt1.setBounds(75, 30, 110, 30);
		jt2.setBounds(255, 30, 110, 30);
		jt3.setBounds(435, 30, 110, 30);
		jt4.setBounds(75, 110, 110, 30);
		jt5.setBounds(295, 110, 70, 30);
		jt6.setBounds(435, 110, 110, 30);
		li1.setBounds(20, 50, 200, 50);
		li2.setBounds(200, 50, 150, 50);
		li3.setBounds(380, 50, 150, 50);
		li4.setBounds(20, 130, 150, 50);
		li5.setBounds(200, 130, 150, 50);
		li6.setBounds(380, 130, 200, 50);
		
		JButton jb1=new JButton("添加记录");
		jb1.setFont(new Font("宋体", Font.BOLD, 25));
		container.add(jb1);
		jb1.setBounds(200, 180, 150, 50);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xuehao=jt1.getText();
				String xingming=jt2.getText();
				String riqi=jt3.getText();
				String didian=jt4.getText();
				String ke=jt5.getText();
				String xingzhi=jt6.getText();
				
				File file1 =new File("zhunbeijilu.txt");
				String jilu="";
				
				try {
					FileReader fr=new FileReader(file1);
					char[] linshi2=new char[1024];
					int hasread=-1;
					while((hasread=fr.read(linshi2))!=-1) {
						 jilu=new String(linshi2,0,hasread);
					}
					fr.close();
				} catch (FileNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				String jilu2=jilu;
				int num1=jilu2.lastIndexOf("\n", jilu2.length()-5)+2;
				String shuzi=jilu2.substring(num1, num1+2);
				int shu=Integer.parseInt(shuzi);
				shu=shu+1;
				
				
				String jilu3=jilu2+"\n\t"+shu+"\t\t"+xuehao+"\t"+xingming+"\t\t"+riqi+"\t"+didian+"\t\t当天第"+ke+"节课"+"\t\t"+xingzhi;
				File file2=new File("zhunbeijilu.txt");
						FileWriter fw;
						try {
							fw = new FileWriter(file2);
							fw.write(jilu3);
							fw.close();
						} catch (IOException e1) {
							// TODO 自动生成的 catch 块
							e1.printStackTrace();
						}
						
				JOptionPane.showMessageDialog(null,"添加成功","",JOptionPane.WARNING_MESSAGE);
				setVisible(false);
				
			}
		});

		
	}
}


class chakanrenyuan extends JFrame{
	public chakanrenyuan() {
		Container container=getContentPane();
		setBounds(100, 100, 600, 500);
		setTitle("全部人员名单");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JTextArea jt1=new JTextArea();
		container.add(jt1);
		
		
		File file1 =new File("xingmingzhanghao.txt");
		String xinxi="";
		
		try {
			FileReader fr=new FileReader(file1);
			char[] linshi2=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi2))!=-1) {
				 xinxi=new String(linshi2,0,hasread);
			}
			fr.close();
		} catch (FileNotFoundException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		String xinxi2=xinxi;
		
		jt1.setText(xinxi2);
		
		jt1.setFont(new Font("宋体", Font.BOLD, 25));
		jt1.setEditable(false);
		
		
		
	}
}

class chakanjilu extends JFrame{
	public chakanjilu() {
		Container container=getContentPane();
		setTitle("全部考勤记录信息");
		setBounds(100, 100, 1400, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JTextArea jt1=new JTextArea();
		container.add(jt1);
		
		
		File file1 =new File("zhunbeijilu.txt");
		String xinxi="";
		
		try {
			FileReader fr=new FileReader(file1);
			char[] linshi2=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi2))!=-1) {
				 xinxi=new String(linshi2,0,hasread);
			}
			fr.close();
		} catch (FileNotFoundException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		String xinxi2=xinxi;
		
		jt1.setText(xinxi2);
		
		jt1.setFont(new Font("宋体", Font.BOLD, 20));
		jt1.setEditable(false);
		
		
		
	}
}


class shanchu extends JFrame{
	public shanchu() {
	Container container=getContentPane();
	setTitle("全部考勤记录信息");
	setBounds(100, 100, 800, 250);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	container.setLayout(null);
	
	JLabel jl1=new JLabel("姓名：");
	JLabel jl2=new JLabel("日期：");
	JLabel jl3=new JLabel("第几节课：");
	JLabel li1=new JLabel("(例：黄XX)");
	JLabel li2=new JLabel("(例：20210101)");
	JLabel li3=new JLabel("(例：1)");
	JTextArea jtt1=new JTextArea();
	
	
	jl1.setFont(new Font("宋体", Font.BOLD, 20));
	jl2.setFont(new Font("宋体", Font.BOLD, 20));
	jl3.setFont(new Font("宋体", Font.BOLD, 20));
	li1.setFont(new Font("宋体", Font.BOLD, 15));
	li2.setFont(new Font("宋体", Font.BOLD, 15));
	li3.setFont(new Font("宋体", Font.BOLD, 15));
	
	
	JTextField jt1=new JTextField();
	JTextField jt2=new JTextField();
	JTextField jt3=new JTextField();
	
	container.add(jl1);
	container.add(jl2);
	container.add(jl3);
	container.add(li1);
	container.add(li2);
	container.add(li3);
	container.add(jt1);
	container.add(jt2);
	container.add(jt3);
	container.add(jtt1);
	
	jl1.setBounds(20, 20, 100, 50);
	jl2.setBounds(200, 20, 100, 50);
	jl3.setBounds(380, 20, 200, 50);
	jt1.setBounds(75, 30, 110, 30);
	jt2.setBounds(255, 30, 110, 30);
	jt3.setBounds(475, 30, 110, 30);
	li1.setBounds(20, 50, 200, 50);
	li2.setBounds(200, 50, 200, 50);
	li3.setBounds(380, 50, 200, 50);
	jtt1.setBounds(20, 100, 700, 50);
	
	jtt1.setFont(new Font("宋体", Font.BOLD, 20));
	
	JButton jb1=new JButton("查询");
	JButton jb2=new JButton("确定删除");
	
	container.add(jb1);
	container.add(jb2);
	
	
	jb1.setBounds(600, 30, 120, 30);
	jb2.setBounds(280, 160, 150, 30);
	
	jb1.setFont(new Font("宋体", Font.BOLD, 25));
	jb2.setFont(new Font("宋体", Font.BOLD, 25));
	
	
	
	jb1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String xingming=jt1.getText();
			String riqi=jt2.getText();
			String ke=jt3.getText();
			ke="当天第"+ke+"节课";
			
			String shuzu[]= {xingming,riqi,ke};
			
			String jilu="";
			File file1 =new File("zhunbeijilu.txt");
			
			try {
				FileReader fr=new FileReader(file1);
				char[] linshi2=new char[1024];
				int hasread=-1;
				while((hasread=fr.read(linshi2))!=-1) {
					jilu=new String(linshi2,0,hasread);
				}
				fr.close();
			} catch (FileNotFoundException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			String jilu2=jilu;
			String jilu3[]=jilu2.split("\n");
			
			SinglyList a=new SinglyList(jilu3);
			String jieguo=a.search(shuzu);
			
			if(jieguo!="") {
			jieguo=jieguo.substring(1);
			System.out.println(jieguo);
			jieguo=jieguo.replace(" ", "");
			
			String neirong=(String) a.get(Integer.parseInt(jieguo));
			System.out.println(neirong);
			neirong=neirong.replace("\t", " ");
			jtt1.setText(neirong);}
			else {
				JOptionPane.showMessageDialog(null,"无此记录","无此记录",JOptionPane.WARNING_MESSAGE);

			}
			
		}
	});
	
	jb2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String xingming=jt1.getText();
			String riqi=jt2.getText();
			String ke=jt3.getText();
			ke="当天第"+ke+"节课";
			
			String shuzu[]= {xingming,riqi,ke};
			
			String jilu="";
			File file1 =new File("zhunbeijilu.txt");
			
			try {
				FileReader fr=new FileReader(file1);
				char[] linshi2=new char[1024];
				int hasread=-1;
				while((hasread=fr.read(linshi2))!=-1) {
					jilu=new String(linshi2,0,hasread);
				}
				fr.close();
			} catch (FileNotFoundException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			String jilu2=jilu;
			String jilu3[]=jilu2.split("\n");
			
			SinglyList a=new SinglyList(jilu3);
			String jieguo=a.search(shuzu);
			jieguo=jieguo.substring(1);
			
			int jie=Integer.parseInt(jieguo);
			a.remove(jie);
			String xinjilu=a.toString();
			
			
			File file2=new File("zhunbeijilu.txt");
			FileWriter fw;
			
				try {
					fw = new FileWriter(file2);
					fw.write(xinjilu);
					fw.close();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"删除成功","",JOptionPane.WARNING_MESSAGE);
				setVisible(false);
			
		}
	});
	
	
	
}}

class xiugai extends JFrame{
	public xiugai() {
		Container container=getContentPane();
		setTitle("全部考勤记录信息");
		setBounds(100, 100, 800, 250);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		container.setLayout(null);
		
		JLabel jl1=new JLabel("姓名：");
		JLabel jl2=new JLabel("日期：");
		JLabel jl3=new JLabel("第几节课：");
		JLabel li1=new JLabel("(例：黄XX)");
		JLabel li2=new JLabel("(例：20210101)");
		JLabel li3=new JLabel("(例：1)");
		JTextArea jtt1=new JTextArea();
		
		
		jl1.setFont(new Font("宋体", Font.BOLD, 20));
		jl2.setFont(new Font("宋体", Font.BOLD, 20));
		jl3.setFont(new Font("宋体", Font.BOLD, 20));
		li1.setFont(new Font("宋体", Font.BOLD, 15));
		li2.setFont(new Font("宋体", Font.BOLD, 15));
		li3.setFont(new Font("宋体", Font.BOLD, 15));
		
		
		JTextField jt1=new JTextField();
		JTextField jt2=new JTextField();
		JTextField jt3=new JTextField();
		
		container.add(jl1);
		container.add(jl2);
		container.add(jl3);
		container.add(li1);
		container.add(li2);
		container.add(li3);
		container.add(jt1);
		container.add(jt2);
		container.add(jt3);
		container.add(jtt1);
		
		jl1.setBounds(20, 20, 100, 50);
		jl2.setBounds(200, 20, 100, 50);
		jl3.setBounds(380, 20, 200, 50);
		jt1.setBounds(75, 30, 110, 30);
		jt2.setBounds(255, 30, 110, 30);
		jt3.setBounds(475, 30, 110, 30);
		li1.setBounds(20, 50, 200, 50);
		li2.setBounds(200, 50, 200, 50);
		li3.setBounds(380, 50, 200, 50);
		jtt1.setBounds(20, 100, 700, 50);
		
		jtt1.setFont(new Font("宋体", Font.BOLD, 20));
		
		JButton jb1=new JButton("查询");
		JButton jb2=new JButton("修改日期");
		JButton jb3=new JButton("修改性质");
		JButton jb4=new JButton("修改课时");
		
		container.add(jb1);
		container.add(jb2);
		container.add(jb3);
		container.add(jb4);
		
		
		jb1.setBounds(600, 30, 120, 30);
		jb2.setBounds(100, 160, 150, 30);
		jb3.setBounds(300, 160, 150, 30);
		jb4.setBounds(500, 160, 150, 30);
		
		jb1.setFont(new Font("宋体", Font.BOLD, 25));
		jb2.setFont(new Font("宋体", Font.BOLD, 25));
		jb3.setFont(new Font("宋体", Font.BOLD, 25));
		jb4.setFont(new Font("宋体", Font.BOLD, 25));
		
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xingming=jt1.getText();
				String riqi=jt2.getText();
				String ke=jt3.getText();
				ke="当天第"+ke+"节课";
				
				String shuzu[]= {xingming,riqi,ke};
				
				String jilu="";
				File file1 =new File("zhunbeijilu.txt");
				
				try {
					FileReader fr=new FileReader(file1);
					char[] linshi2=new char[1024];
					int hasread=-1;
					while((hasread=fr.read(linshi2))!=-1) {
						jilu=new String(linshi2,0,hasread);
					}
					fr.close();
				} catch (FileNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				String jilu2=jilu;
				String jilu3[]=jilu2.split("\n");
				
				SinglyList a=new SinglyList(jilu3);
				String jieguo=a.search(shuzu);
				
				if(jieguo!="") {
				jieguo=jieguo.substring(1);
				System.out.println(jieguo);
				jieguo=jieguo.replace(" ", "");
				
				String neirong=(String) a.get(Integer.parseInt(jieguo));
				System.out.println(neirong);
				neirong=neirong.replace("\t", " ");
				jtt1.setText(neirong);}
				else {
					JOptionPane.showMessageDialog(null,"无此记录","无此记录",JOptionPane.WARNING_MESSAGE);

				}

			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xingming=jt1.getText();
				String riqi=jt2.getText();
				String ke=jt3.getText();
				ke="当天第"+ke+"节课";
				
				String shuzu[]= {xingming,riqi,ke};
				
				String jilu="";
				File file1 =new File("zhunbeijilu.txt");
				
				try {
					FileReader fr=new FileReader(file1);
					char[] linshi2=new char[1024];
					int hasread=-1;
					while((hasread=fr.read(linshi2))!=-1) {
						jilu=new String(linshi2,0,hasread);
					}
					fr.close();
				} catch (FileNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				String jilu2=jilu;
				String jilu3[]=jilu2.split("\n");
				
				SinglyList a=new SinglyList(jilu3);
				String jieguo=a.search(shuzu);		
				jieguo=jieguo.substring(1);
				int num2=Integer.parseInt(jieguo);
				
				SeqList b=new SeqList(jilu3);
				String riqi2 = JOptionPane.showInputDialog("请输入日期"); 
				String xiugaiqian=(String) b.value(num2+1);
				String xiugaihou=xiugaiqian.replace(riqi, riqi2);
				b.modify(xiugaihou, num2+1);
				
				String xinjilu="";
				
				for(int o=1;o<=b.length;o++) {
					 xinjilu=xinjilu+b.value(o)+"\n";
				}
				File file2=new File("zhunbeijilu.txt");
				
					
						
						FileWriter fw;
						try {
							fw = new FileWriter(file2);
							fw.write(xinjilu);
							fw.close();
						} catch (IOException e1) {
							// TODO 自动生成的 catch 块
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null,"修改成功","修改成功",JOptionPane.WARNING_MESSAGE);

				
			}
		});
		
jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xingming=jt1.getText();
				String riqi=jt2.getText();
				String ke=jt3.getText();
				ke="当天第"+ke+"节课";
				
				String shuzu[]= {xingming,riqi,ke};
				
				String jilu="";
				File file1 =new File("zhunbeijilu.txt");
				
				try {
					FileReader fr=new FileReader(file1);
					char[] linshi2=new char[1024];
					int hasread=-1;
					while((hasread=fr.read(linshi2))!=-1) {
						jilu=new String(linshi2,0,hasread);
					}
					fr.close();
				} catch (FileNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				String jilu2=jilu;
				String jilu3[]=jilu2.split("\n");
				
				SinglyList a=new SinglyList(jilu3);
				String jieguo=a.search(shuzu);	
				System.out.println(jieguo);
				jieguo=jieguo.substring(1);
				int num2=Integer.parseInt(jieguo);
				
				SeqList b=new SeqList(jilu3);
				String xingzhi2 = JOptionPane.showInputDialog("请输入性质"); 
				String xiugaiqian=(String) b.value(num2+1);
				String xingzhi=xiugaiqian.substring(xiugaiqian.length()-2, xiugaiqian.length());
				String xiugaihou=xiugaiqian.replace(xingzhi, xingzhi2);
				b.modify(xiugaihou, num2+1);
				
				String xinjilu="";
				
				for(int o=1;o<=b.length;o++) {
					 xinjilu=xinjilu+b.value(o)+"\n";
				}
				File file2=new File("zhunbeijilu.txt");
				
					
						
						FileWriter fw;
						try {
							fw = new FileWriter(file2);
							fw.write(xinjilu);
							fw.close();
						} catch (IOException e1) {
							// TODO 自动生成的 catch 块
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null,"修改成功","修改成功",JOptionPane.WARNING_MESSAGE);

				
			}
		});


jb4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String xingming=jt1.getText();
		String riqi=jt2.getText();
		String ke=jt3.getText();
		ke="当天第"+ke+"节课";
		
		String shuzu[]= {xingming,riqi,ke};
		
		String jilu="";
		File file1 =new File("zhunbeijilu.txt");
		
		try {
			FileReader fr=new FileReader(file1);
			char[] linshi2=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi2))!=-1) {
				jilu=new String(linshi2,0,hasread);
			}
			fr.close();
		} catch (FileNotFoundException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		String jilu2=jilu;
		String jilu3[]=jilu2.split("\n");
		
		SinglyList a=new SinglyList(jilu3);
		String jieguo=a.search(shuzu);		
		jieguo=jieguo.substring(1);
		int num2=Integer.parseInt(jieguo);
		
		SeqList b=new SeqList(jilu3);
		String ke2 = JOptionPane.showInputDialog("请输入课时"); 
		ke2="当天第"+ke2+"节课";
		String xiugaiqian=(String) b.value(num2+1);
		String xiugaihou=xiugaiqian.replace(ke, ke2);
		b.modify(xiugaihou, num2+1);
		
		String xinjilu="";
		
		for(int o=1;o<=b.length;o++) {
			 xinjilu=xinjilu+b.value(o)+"\n";
		}
		File file2=new File("zhunbeijilu.txt");
		
			
				
				FileWriter fw;
				try {
					fw = new FileWriter(file2);
					fw.write(xinjilu);
					fw.close();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"修改成功","修改成功",JOptionPane.WARNING_MESSAGE);

		
	}
});

		
		
		
	}
}

class chaxun extends JFrame{
	public chaxun() {
		Container container=getContentPane();
		setTitle("全部考勤记录信息");
		setBounds(100, 100, 900, 300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		container.setLayout(null);
		
		JLabel jl1=new JLabel("姓名：");
		JLabel jl2=new JLabel("日期：");
		JLabel jl4=new JLabel("——");
		JLabel jl3=new JLabel("性质：");
		JLabel jl5=new JLabel("或");
		JLabel li1=new JLabel("(例：黄XX)");
		JLabel li2=new JLabel("(例：20210101——20210105)");
		JLabel li3=new JLabel("(例：缺席 或 迟到)");
		JTextArea jtt1=new JTextArea();
		JScrollPane scroll = new JScrollPane(jtt1);
		
		jl1.setFont(new Font("宋体", Font.BOLD, 20));
		jl2.setFont(new Font("宋体", Font.BOLD, 20));
		jl3.setFont(new Font("宋体", Font.BOLD, 20));
		jl5.setFont(new Font("宋体", Font.BOLD, 20));
		li1.setFont(new Font("宋体", Font.BOLD, 15));
		li2.setFont(new Font("宋体", Font.BOLD, 15));
		li3.setFont(new Font("宋体", Font.BOLD, 15));
		
		
		JTextField jt1=new JTextField();
		JTextField jt2=new JTextField();
		JTextField jt3=new JTextField();
		JTextField jt4=new JTextField();
		JTextField jt5=new JTextField();
		
		container.add(jl1);
		container.add(jl2);
		container.add(jl3);
		container.add(jl4);
		container.add(jl5);
		container.add(li1);
		container.add(li2);
		container.add(li3);
		container.add(jt1);
		container.add(jt2);
		container.add(jt3);
		container.add(jt4);
		container.add(jt5);
		container.add(scroll);
		
		jl1.setBounds(20, 20, 100, 50);
		jl2.setBounds(200, 20, 100, 50);
		jl3.setBounds(490, 20, 200, 50);
		jl4.setBounds(350, 20, 200, 50);
		jl5.setBounds(635, 20, 200, 50);
		jt1.setBounds(75, 30, 110, 30);
		jt2.setBounds(255, 30, 90, 30);
		jt4.setBounds(380, 30, 90, 30);
		jt3.setBounds(550, 30, 80, 30);
		jt5.setBounds(660, 30, 80, 30);
		li1.setBounds(20, 50, 200, 50);
		li2.setBounds(200, 50, 300, 50);
		li3.setBounds(550, 50, 200, 50);
		scroll.setBounds(20, 100, 840, 140);
		
		jtt1.setFont(new Font("宋体", Font.BOLD, 20));
		
		JButton jb1=new JButton("查询和统计");
		
		container.add(jb1);
		
		
		
		jb1.setBounds(750, 30, 120, 30);

		
		jb1.setFont(new Font("宋体", Font.BOLD, 15));
		
		JRadioButton jr1=new JRadioButton("按学号显示");
        JRadioButton jr2=new JRadioButton("按次数从多到少显示");
        ButtonGroup  bg1=new ButtonGroup();
        bg1.add(jr1);
        bg1.add(jr2);
        container.add(jr1);
        container.add(jr2);
        jr1.setBounds(510, 3, 100, 20);
        jr2.setBounds(620, 3, 200, 20);
		
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xingming=jt1.getText();
				String riqi1=jt2.getText();
				String riqi2=jt4.getText();
				if(riqi1.equals("")) {
					riqi1="0";
				}
				if(riqi2.equals("")) {
					riqi2="0";
				}
				
				
					int num1=Integer.parseInt(riqi1);
					System.out.println(riqi1);
					int num2=Integer.parseInt(riqi2);
					System.out.println(riqi2);
					String riqishuzu[]=new String[num2-num1+1];
					if(riqi1.equals(riqi2)) {
						 riqishuzu[0]= riqi1;
					}
					else {
					for(int i=0;i<=(num2-num1);i++) {
						riqishuzu[i]=(num1+i)+"";
						
					}}
				
				String xingzhi1=jt3.getText();
				System.out.println(xingzhi1);
				String xingzhi2=jt5.getText();
				System.out.println(xingzhi2);

				
				String xingzhishuzu[]= {xingzhi1,xingzhi2};
					
				String jilu="";
				File file1 =new File("zhunbeijilu.txt");
				
				try {
					FileReader fr=new FileReader(file1);
					char[] linshi2=new char[1024];
					int hasread=-1;
					while((hasread=fr.read(linshi2))!=-1) {
						jilu=new String(linshi2,0,hasread);
					}
					fr.close();
				} catch (FileNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				String jilu2=jilu;
				String jilu3[]=jilu2.split("\n");
				
				SinglyList a=new SinglyList(jilu3);
				String jieguo="";
				
				if(riqi1.equals("")) {
					for(int o=0;o<2;o++) {
						String sousuo[]= {xingming,xingzhishuzu[o]};
						jieguo=jieguo+a.search(sousuo);
						System.out.println(jieguo);
						
					}
				}
				
				else if(xingzhi1.equals("")){
					for(int i=0;i<riqishuzu.length;i++) {
						
							String sousuo[]= {xingming,riqishuzu[i]};
							jieguo=jieguo+a.search(sousuo);
							System.out.println(jieguo);
							
						
					}
				}
				else {
				for(int i=0;i<riqishuzu.length;i++) {
					for(int o=0;o<2;o++) {
						String sousuo[]= {xingming,riqishuzu[i],xingzhishuzu[o]};
						jieguo=jieguo+a.search(sousuo);
						
						
					}
				}}
				System.out.println(jieguo);
				String shuzi[]=jieguo.split(",");
				int shuzi2[]=new int[shuzi.length-1];
				for(int i=0;i<shuzi.length-1;i++) {
					shuzi2[i]=Integer.parseInt(shuzi[i+1]);
				}
				String xianshi="";
				for(int i=0;i<shuzi2.length;i++) {
					 xianshi=xianshi+a.get(shuzi2[i])+"\n";
				}
				System.out.println(xianshi);
				String xianshi1[]=xianshi.split("\n");
				if(jr1.isSelected()) {
					String xuehao[]=new String[xianshi1.length];
					for(int i=0;i<xianshi1.length;i++) {
						int num3=xianshi1[i].indexOf("小");
						xuehao[i]=xianshi1[i].substring(num3-11,num3-1);
						
					}
					
					int xuehao2[]=new int[xuehao.length];
					for(int i=0;i<xuehao.length;i++) {
						xuehao2[i]=Integer.parseInt(xuehao[i]);
						
					}
					
					charu c=new charu();
					xuehao2=c.insertSort(xuehao2, true);
					
					String zuizhong[]=new String[xuehao2.length];
					for(int i=0;i<xuehao2.length;i++) {
						for(int o=0;o<xianshi1.length;o++) {
							if(xianshi1[o].contains(xuehao2[i]+"")) {
								zuizhong[i]=xianshi1[o];
								
							}
						}
					}
					String zuizhong1="";
					for(int i=0;i<zuizhong.length;i++) {
						zuizhong1=zuizhong1+zuizhong[i]+"\n";
					}
					zuizhong1=zuizhong1.replace("\t", " ");
					jtt1.setText(zuizhong1);
				}
				
				if(jr2.isSelected()) {
					String ming[]=new String[xianshi1.length];
					for(int i=0;i<xianshi1.length;i++) {
						int num4=xianshi1[i].indexOf("小");
						ming[i]=xianshi1[i].substring(num4,num4+2);
						System.out.println(ming[i]);
					}
					
					Map<String, Integer> map = new HashMap<>();
				    for (String str : ming) {
				      Integer num = map.get(str);
				      map.put(str, num == null ? 1 : num + 1);
				    }
				    Set set = map.entrySet();
				    Iterator it = set.iterator();
				    
				    Iterator it01 = map.keySet().iterator();
				    
				    int q=0;
				    while (it01.hasNext()) {
				      Object key = it01.next();
				      System.out.println("单词 " + key + " 出现次数 : " + map.get(key));
				      q++;
				    }
				    Iterator it02 = map.keySet().iterator();
				    String mingzishuzi[]=new String[q];
				    int paixu[]=new int[q];
				    int w=0;
				    while (it02.hasNext()) {
					      String key = (String) it02.next();
					      mingzishuzi[w]=key+map.get(key);
					      paixu[w]=map.get(key);
					      System.out.println(mingzishuzi[w]);
					      w++;
					    }
				    charu c=new charu();
					paixu=c.insertSort(paixu, false);  
					String mingzishuzi2[]=new String[50];
					int y=0;
					for(int i=0;i<paixu.length;i++) {
						for(int o=0;o<mingzishuzi.length;o++) {
							if(mingzishuzi[o].contains(paixu[i]+"")) {
								mingzishuzi2[y]=mingzishuzi[o];
								y++;
							}
						}
					}
					
					LinkedHashSet<Object> temp = new LinkedHashSet<>();
					for(int x=0;x<mingzishuzi2.length;x++){
						temp.add(mingzishuzi2[x]);
					}
					
					String[] mingzishuzi5=temp.toArray(new String[0]);
					
					String mingzishuzi3[]=new String[mingzishuzi.length];
					for(int i=0;i<mingzishuzi.length;i++) {
						mingzishuzi3[i]=mingzishuzi5[i].substring(0, 2);
						
					}
					String xianshi2[]=new String[xianshi1.length];
					int t=0;
					for(int i=0;i<mingzishuzi3.length;i++) {
						for(int o=0;o<xianshi1.length;o++) {
							if(xianshi1[o].contains(mingzishuzi3[i])) {
								xianshi2[t]=xianshi1[o];
								System.out.println(xianshi2[t]);
								t++;
							}
						}
					}
					
					String zuihou5="";
					for(int i=0;i<xianshi2.length;i++) {
						zuihou5=zuihou5+xianshi2[i]+"\n";
					}
					zuihou5=zuihou5.replace("\t", " ");
					jtt1.setText(zuihou5);
				    
				    
					
					
					
				}
					
					
					

				
			}
		});
	
	}
}

class charu {


	public static  int[] insertSort(int[] keys,boolean asc) {
		for(int i=1;i<keys.length;i++) {
			int x=keys[i],j;
			for(j=i-1;j>=0&&(asc?x<keys[j]:x>keys[j]);j--) {
				keys[j+1]=keys[j];
			}
			keys[j+1]=x;
//			for(int o=0;o<keys.length;o++) {
//				System.out.print(keys[o]+",");
//				
//			}
			
		}
		return keys;
	}

}