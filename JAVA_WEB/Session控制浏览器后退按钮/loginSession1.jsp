<%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2021/11/15
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>

<script language = "javascript" type = "text/javascript">
    function aa(){
        pushHistory();
        window.addEventListener("popstate", function(e) {
            location.reload(false)
        }, false);
        function pushHistory() {
            var state = {
                title: "title",
                url: "#"
            };
            window.history.pushState('forward', null, "111.jsp");
            window.history.forward(1);
        }
    };
    window.onload=aa();
</script>
<form action="loginSession2.jsp">

    账号：<input type="text" name="user"/><br>
    密码：<input type="text" name="password"/><br>
    <input type="submit">

</form>
</body>
</html>
