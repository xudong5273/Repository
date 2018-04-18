<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>捡到列表</title>
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
    <h1>捡到列表</h1>
    <div id="content">
        <table cellspacing="0" cellpadding="0">
            <tr>
                <td>序号</td>
                <td>姓名</td>
                <td>班级</td>
                <td>物品名称</td>
                <td>丢失时间</td>
                <td>丢失地点</td>
                <td>联系方式</td>
            </tr>
            <%int i=1;%>
            <c:forEach items="${founds}" var="found">
                <tr>
                    <td><%=i++%></td>
                    <td>${found.foundname}</td>
                    <td>${found.classes}</td>
                    <td>${found.foundthings}</td>
                    <td>${found.founddate}</td>
                    <td>${found.foundplace}</td>
                    <td>${found.phone}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>