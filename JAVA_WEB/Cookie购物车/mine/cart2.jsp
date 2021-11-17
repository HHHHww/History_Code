<%--
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
<%
    //获取cookie
    Cookie[] cookies = request.getCookies();
    String delete = request.getParameter("delete");
%>
<%
    if (cookies != null) {
        for (int i = 0; i < cookies.length; i++) {
            String name = cookies[i].getName();
            if (name.startsWith("book")) {
                if (delete != null && name.equals(delete)) {
                    cookies[i].setMaxAge(0);
                    response.addCookie(cookies[i]);
                } else {%>
<a href="cart2.jsp?delete=<%=name%> ">&nbsp删除&nbsp</a>
<%
                    out.print(cookies[i].getValue() + "<br/>");
                }
            }
        }
    }%>
<%--   <%if(cookies!=null && cookies.length>0) {--%>
<%--        for(int i=0; i<cookies.length;i++) {--%>
<%--            cookie = cookies[i];--%>
<%--           cookie.setMaxAge(0);--%>
<%--            response.addCookie(cookie);--%>
<%--        }--%>
<%--    }%>--%>
<a href="book2.jsp">继续购买书籍</a>
</body>
</html>
