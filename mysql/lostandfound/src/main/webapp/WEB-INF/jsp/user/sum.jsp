<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>信息总结</title>
    <link href="${pageContext.request.contextPath}/resources/css/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/tablecloth.js"></script>
    <!-- end -->
    <style>
        body { margin:0; padding:0; background:#f1f1f1; font:70% Arial, Helvetica, sans-serif; color:#555; line-height:150%; text-align:left; }
        a { text-decoration:none; color:#057fac; }
        a:hover { text-decoration:none; color:#999; }
        h1 { font-size:140%; margin:0 20px; line-height:80px; }
        h2 { font-size:120%; }
        #container { margin:0 auto; width:680px; background:#fff; padding-bottom:20px; }
        #content { margin:0 20px; }
        p.sig { margin:0 auto; width:680px; padding:1em 0; }
        form { margin:1em 0; padding:.2em 20px; background:#eee; }
    </style>
</head>
<body>
<div id="container">
    <h1>信息总结</h1>
    <div id="content">
        <table cellspacing="0" cellpadding="0">
            <tr>
                <th>班级</th>
                <th>丢失次数</th>
                <th>拾物次数</th>
            </tr>
            <c:forEach items="${resultDtos}" var="resultDto">
                <tr>
                    <td>${resultDto.classess}</td>
                    <td>${resultDto.lostcount}</td>
                    <td>${resultDto.foundcount}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>