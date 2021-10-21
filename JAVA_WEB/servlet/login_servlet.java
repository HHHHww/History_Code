package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.sql.*;

public class login_servlet extends HttpServlet {

    private static ResultSet rs = null;
    private static PreparedStatement statement = null;

    private static Connection connection = null;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //向服务器发送请求获取到参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        initDB();
        String result = find(username, password);
        response.setHeader("Content-Type", "text/html; charset=UTF-8");
        Writer writer = response.getWriter();
        if (result.equals("登陆成功")) {
            writer.write(username+"登陆成功");
        } else {
            writer.write(username+"登录失败");
        }


        writer.flush();
        writer.close();
    }

    //初始化数据库
    public void initDB() throws ServletException {
        try {
            //2.创建连接
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/javaweb?useSSL=true&" +
                            "characterEncoding=utf-8&user=" +
                            "root&password=123456");//user为root，密码为1234
            System.out.println("创建连接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //数据库账号密码校验逻辑
    public static String find(String username, String password) {
        try {

            //3.写sql
            String sql = "select password from user where username=?";


            //4.得到statement对象
            statement = connection.prepareStatement(sql);

            statement.setString(1, username);
            //5.执行sql得到结果集
            rs = statement.executeQuery();
            //6.处理结果集
            while (rs.next()) {
                if (rs.getString(1).equals(password)) {
                    System.out.println(rs.getString(1));
                    return "登陆成功";
                } else {
                    return "登录失败";
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
        return "登录失败2";
    }
}
