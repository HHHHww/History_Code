<%--
  Created by IntelliJ IDEA.
  User: huangwenye
  Date: 2021/10/4
  Time: 12:37 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>account2</title>
</head>
<body>
<%
    String str=request.getParameter("account");
%>
<form action="account3.jsp">
    请输入用户姓名：<input name="name">
    <input type="submit">
    <input name="account" type="hidden" value="<%= str %>">

</form>
</body>
</html>
