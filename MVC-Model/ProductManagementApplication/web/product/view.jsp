<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 06/11/2019
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
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
</table>
</body>
</html>
