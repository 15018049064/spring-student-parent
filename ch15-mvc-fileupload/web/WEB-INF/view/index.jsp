<%--
  Created by IntelliJ IDEA.
  User: 吴平蛟
  Date: 2019/11/20
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
</head>
<body>
<form method="post" action="/file" enctype="multipart/form-data">

    <div>
        <div >
            <img id="preview" style="width: 105px; height: 105px; margin: 20px auto;">
        </div>
        <input type="file" id="file" name="myFile"><br>
    </div>
    <input type="submit" value="提交">
</form>
<img src="/download?filename=1.jpg" style="width: 105px; height: 105px; margin: 20px auto;">
<a href="/download?filename=1.jpg">下载</a>

<a href="/download?filename=汽车.jpg">下载(中文)</a>

<script>
    $("#file").change(function (event) {
        var file = $("#file")[0].files[0];
        var reader = new FileReader();
        reader.onload = function (e) {
            $("#preview").attr("src", this.result);
        };
        reader.readAsDataURL(file);
    });
</script>
</body>
</html>
