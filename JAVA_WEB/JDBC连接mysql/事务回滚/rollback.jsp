<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2021/10/13
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>rollback</title>
</head>
<body>
<%!
    public static void roll() throws SQLException {
        Connection connection=null;
        PreparedStatement statement1 = null;
        PreparedStatement statement2 = null;
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb","root","123456");


            connection.setAutoCommit(false);
            //3.写sql
            String sql1 = "update account set balance=balance-? where NAME=?";
            String sql2 = "update account set balance=balance+? where NAME=?";
            //4.得到statement对象
            statement1 = connection.prepareStatement(sql1);
            statement2 = connection.prepareStatement(sql2);
            //6.处理结果集,插入数据
            statement1.setString(1,"500");
            statement1.setString(2,"zhangsan");
            statement1.executeUpdate();
            // 手动制造异常 int i = 3/0;
            int i=3/0;
            statement2.setString(1,"500");
            statement2.setString(2,"lisi");
            statement2.executeUpdate();
            connection.commit();
            System.out.println("修改成功！");
            //7.关闭资源
        } catch (Exception e) {
            connection.rollback();
        }
        try{

            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
%>
<%
    out.println("张三账号-500，李四账号+500");
    roll();%>

<br>
 <%   out.println("有异常，事务回滚");

    %>
</body>
</html>
