<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2021/11/4
  Time: 0:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="cart.jsp" method="post">
    <h4>您的购物车如下所示</h4>
    <%
        ArrayList books = (ArrayList) session.getAttribute("books");
        String delete1 = request.getParameter("delete");
        if (delete1 != null) {
            int delete2 = Integer.valueOf(delete1);
            books.remove(delete2);
            session.setAttribute("books", books);
        }


        for (int i = 0; i < books.size(); i++) {%>
    <a href="cart.jsp?delete=<%=i%> ">&nbsp删除&nbsp</a>

    <% out.println("《" + books.get(i) + "》" + "<br>");
    }%>


    <a href="book.jsp">继续购买书籍</a>
</form>
</body>
</html>
