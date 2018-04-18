<%--
  Created by IntelliJ IDEA.
  User: 陈旭东
  Date: 2018/3/25
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>select</title>
</head>
<style>
    .button {
        display: inline-block;
        border-radius: 4px;
        background-color: #f4511e;
        border: none;
        color: #FFFFFF;
        text-align: center;
        font-size: 28px;
        padding: 20px;
        width: 250px;
        transition: all 0.5s;
        cursor: pointer;
        margin: 5px;
    }

    .button span {
        cursor: pointer;
        display: inline-block;
        position: relative;
        transition: 0.5s;
    }

    .button span:after {
        content: '»';
        position: absolute;
        opacity: 0;
        top: 0;
        right: -20px;
        transition: 0.5s;
    }

    .button:hover span {
        padding-right: 25px;
    }

    .button:hover span:after {
        opacity: 1;
        right: 0;
    }
</style>
<body>
<div style="text-align: center; width: 1520px; border: green solid 0px;">
    <img alt="head" src="resources/images/head.jpg" style="margin: 0 auto;" />
</div>
<%--<button onclick=window.location.href="page/login">失物招领系统</button>--%>
<div style="text-align: center; width: 1520px; border: green solid 0px;">

<button class="button" style="vertical-align:middle"  onclick=window.location.href="user/lost"><span>丢失</span></button>
<button class="button" style="vertical-align:middle"  onclick=window.location.href="user/found"><span>捡到</span></button>
<button class="button" style="vertical-align:middle"  onclick=window.location.href="user/sum"><span>总结</span></button>
</div>
</body>
</html>
