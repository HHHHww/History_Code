<%@ page import="java.util.HashMap" %>
<%@ page import="jdk.nashorn.internal.runtime.FindProperty" %><%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2021/9/26
  Time: 0:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!

    public void find( HashMap<Integer,Integer> map,int money) {
        int num=0;
        num=money/50;
        map.put(50,num);
        num=money%50/20;
        map.put(20,num);
        num=money%50%20/10;
        map.put(10,num);
        num=money%50%20%10/5;
        map.put(5,num);
        num=money%50%20%10%5;
        map.put(1,num);
    }
    %>
<%
    int money=Integer.parseInt(request.getParameter("money"));
    HashMap<Integer,Integer> map=new HashMap<>();
    find(map,money);


%>

<form>
    <table border='1' width="500px">
        <tr>
            <td width="322px">please input money:<input type="text" name="money" value="<%=money%>"></td>
            <td><button>commit</button></td>
        </tr>
        <tr>
            <td width="322px">50 yuan of number is:</td>
            <td><%=map.get(50)%></td>
        </tr>
        <tr>
            <td width="322px">20 yuan of number is:</td>
            <td><%=map.get(20)%></td>
        </tr>
        <tr>
            <td width="322px">10 yuan of number is:</td>
            <td><%=map.get(10)%></td>
        </tr>
        <tr>
            <td width="322px">5 yuan of number is:</td>
            <td><%=map.get(5)%></td>
        </tr>
        <tr>
            <td width="322px">1 yuan of number is:</td>
            <td><%=map.get(1)%></td>
        </tr>
    </table>

</form>
</body>
</html>
