<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Login</title>
    <meta charset="utf-8">
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</head>
<body>
<!-----start-main---->
<div class="main">
    <div class="login-form">
        <a href=/lostandfound/index.jsp><h1>失物招领系统</h1></a>
        <div class="head">
            <img src="${pageContext.request.contextPath}/resources/images/user.png" alt=""/>
        </div>
        <form action="/lostandfound/login" method="post">
            <input type="text" class="text" value="请输入用户名" name="username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'USERNAME';}" >
            <input type="password" value="请输入密码" name="password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
            <div class="submit">
                <input type="submit" onclick="myFunction()" value="LOGIN" >
            </div>
            <p><a href="register">Forgot Password ?</a></p>
        </form>
    </div>
</div>

</body>
</html>