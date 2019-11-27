<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        span{
            color: red;
        }
    </style>
</head>
<body>
<form method="get" action="/validation">
    请输入姓名：<input type="text" name="username"><span>${username}</span><br>
    请输入工资：<input type="text" name="salary"><span>${salary}</span><br>
    请输入日期：<input type="text" name="hiredate"><span>${hiredate}</span><br>
    请输入性别：<input type="radio" name="gender" value="1">男
    <input type="radio" name="gender" value="0">女 &nbsp&nbsp<span>${gender}</span><br>
    请输入部门编号：<input type="text" name="deptid"><br>
    <input type="submit" value="确认">
</form>
</body>
</html>
