<%@ page import="java.util.Scanner" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2021/10/14
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String username3=request.getParameter("name");

    String password3=request.getParameter("password");
    out.println(main(username3,password3));


%>


<%!

        public  String main(String username3,String password3) {

            return login(username3, password3);
    }

        public  String login(String name,String password){

            String password2 = null;
            Connection con=null;
            ResultSet rs=null;
            String sql;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb","root","123456");
            }catch(Exception e){
                System.out.println(e);
            }


            try {
                sql="select * from user";
                PreparedStatement pstm = con.prepareStatement(sql);
                rs=pstm.executeQuery();
                while (rs.next()) {

                    if (rs.getString("username").equals(name)) {
                        if (rs.getString("password").equals(password)) {
                            System.out.println("登陆成功");
                            return "登陆成功";
                        } else {
                            System.out.print("登录失败");
                            return "登录失败";
                        }
                    }
                }
                rs.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "登录失败";
        }
    %>





</body>
</html>
