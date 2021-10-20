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
    <title>Title</title>
</head>
<body>
<form action="mysql_find.jsp">
    请输入学生姓名的模糊资料：<input name="name">
    <input type="submit">

</form>
<%
    String account=request.getParameter("name");
    Connection con=null;
    ResultSet rs=null;
    String sql;
    try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb","root","123456");
    }catch(Exception e){
        System.out.println(e);
    }
    try{
        sql="select * from student where name like ?";
        PreparedStatement  pstm = con.prepareStatement(sql);
        pstm.setObject(1,"%"+account+"%");
        rs=pstm.executeQuery();
        while(rs.next()) {%>
<tr><td>id:</td><td><%out.println(rs.getInt(1)+"  "); %></td>
    <td>name:</td><td><%out.println(rs.getString(2)+"  "); %></td>
    <td>gender:</td><td><%out.println(rs.getInt(3)+"  "); %></td>
    <td>birthday:</td><td><%out.println(rs.getString(4)+"  "); %></td></tr>
    <br/>
<%}

    }catch(Exception e){
        System.out.println(e);
    }
    try{
        rs.close();
        con.close();
    }catch(Exception e){
        System.out.println(e);
    }
%>
</body>
</html>
