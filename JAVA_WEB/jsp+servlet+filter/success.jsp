<%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2021/11/1
  Time: 1:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username=request.getParameter("username");



%>
登录成功！<%=username%>,欢迎您
</body>
</html>
