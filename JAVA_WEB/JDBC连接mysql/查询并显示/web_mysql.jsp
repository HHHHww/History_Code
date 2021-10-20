<%@ page import="java.sql.*" %>
<%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2021/10/13
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<body>
    <table>
        <%
            Connection con=null;
            Statement st=null;
            ResultSet rs=null;
            String sql;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb","root","123456");
                st=con.createStatement();
            }catch(Exception e){
                System.out.println(e);
            }
            try{
                sql="select * from student";
                rs=st.executeQuery(sql);
                while(rs.next()){%>
        <tr><td>id:</td><td><%out.println(rs.getInt(1)+"  "); %></td>
            <td>name:</td><td><%out.println(rs.getString(2)+"  "); %></td>
            <td>gender:</td><td><%out.println(rs.getInt(3)+"  "); %></td>
            <td>birthday:</td><td><%out.println(rs.getString(4)+"  "); %></td></tr>
        <%
                }
            }catch(Exception e){
                    System.out.println(e);
            }
            try{
                rs.close();
                st.close();
                con.close();
            }catch(Exception e){
                System.out.println(e);
            }
        %>
    </table>
</body>
</body>
</html>
