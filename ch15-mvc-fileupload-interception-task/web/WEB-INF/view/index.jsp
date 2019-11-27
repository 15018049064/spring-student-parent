<%--
  Created by IntelliJ IDEA.
  User: 吴平蛟
  Date: 2019/11/20
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/file" method="post" enctype="multipart/form-data">
    <input type="file" name="myFile">
    <input type="submit" value="保存">
</form>

<img src="/download?filename=1.jpg" style="width:100px">
<a href="/download?filename=1.jpg">下载</a>
</body>
</html>
