<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 26/11/2019
  Time: 08:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<div>
    <a href="/createForm">Create</a>
</div>
    <table>
        <tr>
            <td>Code</td>
            <td>Name</td>
            <td>Price</td>
        </tr>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.getCode()}</td>
                <td>${product.getName()}</td>
                <td>${product.getPrice()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
