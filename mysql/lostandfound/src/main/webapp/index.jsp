<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>失物招领系统</title>
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
</head>
<body>
<div style="text-align: center; width: 1520px; border: green solid 0px;">
    <img alt="head" src="resources/images/head.jpg" style="margin: 0 auto;" />
</div>
<%--<button onclick=window.location.href="page/login">失物招领系统</button>--%>
<div style="text-align: center; width: 1520px; border: green solid 0px;">
    <button class="button" style="vertical-align:middle"  onclick=window.location.href="page/login"><span>失物招领系统</span></button>
</div>
<div id="ShowAD" style=" position: absolute;top:150px;left:0;z-index:10;">
    <div style="width:50px;height:18px;font-size:14px;font-weight:bold;text-align:left;cursor:hand;" onClick="closead();"><font color="ff0000">关闭</font></div>
    <img src="resources/images/a.jpg" width="200px" height="500px"></a>
</div>
<script language="javascript">
    var bodyfrm = ( document.compatMode.toLowerCase()=="css1compat" ) ? document.documentElement : document.body;
    var adst = document.getElementById("ShowAD").style;
    adst.top = ( bodyfrm.clientHeight -530-22 ) + "px";
    adst.left = ( bodyfrm.clientWidth -155 ) + "px";
    function moveR() {
        adst.top = ( bodyfrm.scrollTop + bodyfrm.clientHeight - 530-22) + "px";
        adst.left = ( bodyfrm.scrollLeft + bodyfrm.clientWidth - 155 ) + "px";
    }
    setInterval("moveR();", 80);
    function closead()
    {
        adst.display='none';
    }
</script>
</body>
</html>







