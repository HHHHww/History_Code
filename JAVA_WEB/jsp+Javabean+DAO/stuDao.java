package test;

import java.sql.*;

public class stuDao {
    private static ResultSet rs = null;
    private static PreparedStatement statement = null;

    private static Connection connection = null;

    //数据库账号密码校验逻辑
    public static String queryStu(String stuNum, String stuName) {

        try {
            //2.创建连接

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb", "root", "123456");
            System.out.println("创建连接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            //3.写sql
            String sql = "select stuName from student2 where stuNum=?";


            //4.得到statement对象
            statement = connection.prepareStatement(sql);

            statement.setString(1, stuNum);

            //5.执行sql得到结果集
            rs = statement.executeQuery();
            //6.处理结果集
            while (rs.next()) {
                loginBeans beans = new loginBeans();
                if (rs.getString(1).equals(stuName)) {
                    return stuName;
                } else {
                    return null;
                }

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
        return null;
    }


}