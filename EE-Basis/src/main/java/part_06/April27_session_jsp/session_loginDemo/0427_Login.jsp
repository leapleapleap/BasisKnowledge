<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script>
        window.onload = function () {
            document.getElementById("ccpic").onclick = function () {
                var date = new Date();
                this.src = "/demo/checkCode?time=" + date.getTime();
            }
        }
    </script>
    <style>
        div {
            color: red;
        }
    </style>
</head>
<body>
<form action="/demo/login" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" placeholder="请输入账户名" name="username"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" placeholder="请输入密码" name="password"></td>
        </tr>
        <tr>
            <td>验证码：</td>
            <td><input type="text" placeholder="请输入验证码" name="checkcode"></td>
        </tr>
        <tr>
            <td colspan="2"><img id="ccpic" src="/demo/checkCode"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>
<%--当输入的验证码有误时的提示信息--%>
<div><%= request.getSession().getAttribute("fail_code")
        == null ? "" : request.getSession().getAttribute("fail_code")%>
</div>
<%--当输入的账户名或者密码有误时的提示信息--%>
<div><%= request.getSession().getAttribute("fail_empty")
        == null ? "" : request.getSession().getAttribute("fail_empty")%>
</div>
</body>
</html>
