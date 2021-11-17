<%@ page import="test.Book" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2021/11/17
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList books= (ArrayList) session.getAttribute("books");
%>
<table border="2">
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>PRICE</td>
    </tr>
        <%
    for (int i = 0; i <books.size() ; i++) {
        Book book=(Book) books.get(i);

%>
    <tr>
        <td><%=book.getId()%></td>
        <td><%=book.getName()%></td>
        <td><%=book.getPrice()%></td>
    </tr>
        <%
    }
%>
</body>
</html>
