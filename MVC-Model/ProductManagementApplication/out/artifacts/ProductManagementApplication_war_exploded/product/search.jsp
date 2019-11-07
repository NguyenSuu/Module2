<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 07/11/2019
  Time: 09:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Product</title>
</head>
<body>
<h1>Search results</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<%--    <table>--%>
<%--        <tr>--%>
<%--            <td>Name</td>--%>
<%--            <td>Cost</td>--%>
<%--            <td>Description</td>--%>
<%--            <td>Manufacturer</td>--%>
<%--        </tr>--%>
<%--        <c:forEach items="${requestScope['product']}" var="product">--%>
<%--            <tr>--%>
<%--                <td>${product.getNanme()}</td>--%>
<%--                <td>${product.getCost()}</td>--%>
<%--                <td>${product.getDescription()}</td>--%>
<%--                <td>${product.getManufacturer()}</td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>
<table>
    <tr>
        <td>Name:</td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Cost:</td>
        <td>${requestScope["product"].getCost()}</td>
    </tr>
    <tr>
        <td>Description:</td>
        <td>${requestScope["product"].getDescription()}</td>
    </tr>
    <tr>
        <td>Manufacturer:</td>
        <td>${requestScope["product"].getManufacturer()}</td>
    </tr>
</body>
</html>
