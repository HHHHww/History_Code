<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    ArrayList books = (ArrayList) session.getAttribute("books");
    if (books == null) {
        books = new ArrayList();
        session.setAttribute("books", books);
    }
    String book = request.getParameter("b");
    if (book != null) {
        books.add(book);
    }
%>
购物车内容是：
<hr>
<%
    if (books != null) {
        //删除商品
        String delbook = request.getParameter("d");
        if (delbook != null) {
            books.remove(Integer.parseInt(delbook));
        }
        //显示所有商品
        for (int i = 0; i < books.size(); i++) {
            String b = (String) books.get(i);
%>
<%=b%>
<a href="cart.jsp?d=<%=i%>">删除</a>
<br>
<%
        }
    }
%><hr>
<a href="laoshidaima1.jsp">返回选购图书</a>
</body>
</html>