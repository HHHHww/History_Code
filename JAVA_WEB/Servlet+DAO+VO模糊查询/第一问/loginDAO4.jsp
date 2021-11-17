<%@ page import="test.loginBeans" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2021/11/14
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList stus= (ArrayList) session.getAttribute("stus");
%>
<table border="2">
<tr>
    <td>学号</td>
    <td>姓名</td>
</tr>
<%
    for (int i = 0; i <stus.size() ; i++) {
        loginBeans beans=(loginBeans) stus.get(i);

%>
<tr>
    <td><%=beans.getStuNum()%></td>
    <td><%=beans.getStuName()%></td>
</tr>
<%
    }
%>
</table>
</body>
</html>
