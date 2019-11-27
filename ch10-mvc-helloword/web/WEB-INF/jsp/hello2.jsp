<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="d" items="${requestScope.cu}">
    <h1>${d}</h1>
</c:forEach>
</body>
</html>
