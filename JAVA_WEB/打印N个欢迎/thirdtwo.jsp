<%--
  Created by IntelliJ IDEA.
  User: huangwenye
  Date: 2021/10/4
  Time: 12:09 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <%
        int number=Integer.parseInt(request.getParameter("number"));%>
    <%for (int i = 0; i <= number; i++) { %>

    <tr>欢迎</br>

    </tr>
    <% } %>


</form>
</body>
</html>
