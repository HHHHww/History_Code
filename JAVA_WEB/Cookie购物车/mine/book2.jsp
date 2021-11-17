<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2021/11/4
  Time: 2:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="book2.jsp" method="post">
    <%

        String book = request.getParameter("bookname");
        if (book != null) {
            Cookie cookie = new Cookie("book" + System.currentTimeMillis(), book);
            response.addCookie(cookie);

        }
    %>
    《太阳》<a href="book2.jsp?bookname=《太阳》">购买</a>
    《月亮》<a href="book2.jsp?bookname=《月亮》">购买</a>
    《星星》<a href="book2.jsp?bookname=《星星》">购买</a>

    <br>
    <a href="cart2.jsp">查看购物车</a>


</form>
</body>
</html>
