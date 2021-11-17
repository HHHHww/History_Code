<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
购物车内容是：
<hr>
<%
    Cookie[] books = request.getCookies();
    if (books != null) {
        //删除商品
        String delbook = request.getParameter("d");
        for (int i = 0; i < books.length; i++) {
            String name = books[i].getName();
            if (name.startsWith("books")) {
                String bookname = books[i].getValue();
                if (delbook != null && name.equals(delbook)) {
                    books[i].setMaxAge(0);//删除cookie
                    response.addCookie(books[i]);//响应给客户端
                } else {
%>
<%=bookname%>
<a href="laoshidaima4.jsp?d=<%=name%>">删除</a>
<br>
<%
                }
            }
        }
    }
%><hr>
<a href="laoshidaima3.jsp">返回选购图书</a>

</body>
</html>