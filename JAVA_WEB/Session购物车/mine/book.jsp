<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2021/11/4
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="book.jsp" method="post">

    请输入书名：<input name="bookname"> <input type="submit" value="添加到购物车">

    <%
        request.setCharacterEncoding("UTF-8");
        ArrayList books = (ArrayList) session.getAttribute("books");

        if (books == null) {
            books = new ArrayList();
            session.setAttribute("books", books);
        }
        String bookname = request.getParameter("bookname");
        if (bookname != null) {
            books.add(bookname);
            session.setAttribute("books", books);
        }
    %>

    <br>
    <a href="cart.jsp">查看购物车</a>


</form>
</body>
</html>
