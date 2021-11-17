<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2021/11/16
  Time: 3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
String a= (String) session.getAttribute("a");
if (a=="1"){
    Date d = new Date();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    session.setAttribute("log",df.format(d));
%>
<script type="text/javascript" language="javascript">
    alert("您好，欢迎您首次访问");
</script>
<%
}else if (a=="2"){

    String log= (String) session.getAttribute("log");
    Date d = new Date();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    session.setAttribute("log",df.format(d));
    %>
<script type="text/javascript" language="javascript">
    alert("欢迎回来，您上次访问时间为：<%=log%>");
</script>
<%}
%>
<form action="visit" method="POST">
    <input type="submit" value="访问servlet">
</form>
</body>
</html>
