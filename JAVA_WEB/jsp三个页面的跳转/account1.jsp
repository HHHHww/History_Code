<%--
  Created by IntelliJ IDEA.
  User: huangwenye
  Date: 2021/10/4
  Time: 12:37 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>account1</title>
</head>
<body>

<form action="account2.jsp" name="jump">
请输入账号<input type="text" name="account">
请输入密码<input type="text" name="password">
<input type="button" value="commit" onclick="touch()">
</form>
<script type="text/javascript">
    function touch(){
        if(jump.account.value!=jump.password.value){
            alert("账号或密码错误！");return;
        }
        else{
            jump.submit();
        }
    }

</script>



</body>
</html>
