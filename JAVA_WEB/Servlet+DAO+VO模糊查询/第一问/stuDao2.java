package test;

import java.sql.*;
import java.util.ArrayList;

public class stuDao2 {
    private static ResultSet rs = null;
    private static PreparedStatement statement = null;

    private static Connection connection = null;

    //数据库账号密码校验逻辑
    public static ArrayList queryStu(String stuName) {
        ArrayList stus=new ArrayList();
        try {
            //2.创建连接

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb", "root", "123456");
            System.out.println("创建连接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            //3.写sql
            String sql = "select * from student2 where stuName like ?";


            //4.得到statement对象
            statement = connection.prepareStatement(sql);

            statement.setString(1, "%"+stuName+"%");

            //5.执行sql得到结果集
            rs = statement.executeQuery();
            //6.处理结果集
            while (rs.next()) {
                loginBeans beans = new loginBeans();
                beans.setStuName(rs.getString("stuName"));
                beans.setStuNum(rs.getString("stuNum"));
                stus.add(beans);

            }
            //7.关闭资源
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return stus;
    }


}