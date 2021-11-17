<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎进入图书选购区：
<hr>
1.《三国演义》<a href="laoshidaima3.jsp?b=三国演义">购买</a>
<br>
2.《水浒传》<a href="laoshidaima3.jsp?b=水浒传">购买</a>
<br>
3.《西游记》<a href="laoshidaima3.jsp?b=西游记">购买</a>
<hr>
<a href="laoshidaima4.jsp">查看购物车</a>
<%
    request.setCharacterEncoding("utf-8");
    String book = request.getParameter("b");
    if (book != null) {
        //把书名添加到cookie中
        Cookie b = new Cookie("books" + System.currentTimeMillis(), book);
        response.addCookie(b);
    }
%>
</body>
</html>