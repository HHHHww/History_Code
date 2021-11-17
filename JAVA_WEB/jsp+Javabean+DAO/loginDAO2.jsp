<%@ page import="test.loginBeans" %>
<%@ page import="test.stuDao" %><%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2021/11/14
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="stu" class="test.loginBeans"></jsp:useBean>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String stuNum=request.getParameter("stuNum");
    String stuName=request.getParameter("stuName");
    stuDao dao=new stuDao();
    String stuName2=dao.queryStu(stuNum,stuName);
%>
<jsp:setProperty name="stu" property="stuName" value="<%=stuName2%>"></jsp:setProperty>
学生姓名：
<jsp:getProperty property="stuName" name="stu" />
</body>
</html>
