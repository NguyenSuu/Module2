<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 26/11/2019
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Save</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<c:forEach items="${condiments}" var="condiment">
    <h1><c:out value="${condiment}"></c:out></h1>
</c:forEach>
</body>
</html>
