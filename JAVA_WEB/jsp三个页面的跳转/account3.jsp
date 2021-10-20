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
    <title>account3</title>
</head>
<body>
<%
    String account=request.getParameter("account");
    String name=request.getParameter("name");
    out.println("用户账号："+account);
    out.println("用户姓名："+name);
%>
</body>
</html>
