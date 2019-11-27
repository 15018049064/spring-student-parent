<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        li{
            list-style-type: none;
            display: inline-flex;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <th>id</th>
        <th>name</th>
    </tr>
    <c:forEach items="${info.list}" var="dept">
        <tr>
            <td>${dept.id}</td>
            <td>${dept.deptname}</td>
        </tr>
    </c:forEach>
</table>

<a href="/index?pageNum=1&pageSize=${info.pageSize}">首页</a>
<a href="/index?pageNum=${info.prePage}&pageSize=${info.pageSize}">上一页</a>
<li>
    <c:forEach items="${info.navigatepageNums}" var="in">
        <a href="/index?pageNum=${in}&pageSize=${info.pageSize}">${in}</a>
    </c:forEach>
</li>
<a href="/index?pageNum=${info.nextPage}&pageSize=${info.pageSize}">下一页</a>
<a href="/index?pageNum=${info.pages}&pageSize=${info.pageSize}">尾页</a>

</body>
</html>
