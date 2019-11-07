<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 06/11/2019
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit Product</h1>
<c:if test='${requestScope["message"] != null}'>
    <span class="message">${requestScope["message"]}</span>
</c:if>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" id="name" value="${requestScope["product"].getName()}"></td>
        </tr>
        <tr>
            <td>Cost:</td>
            <td><input type="text" name="cost" id="cost" value="${requestScope["product"].getCost()}"></td>
        </tr>
        <tr>
            <td>Description:</td>
            <td><input type="text" name="description" id="description"
                       value="${requestScope["product"].getDescription()}"></td>
        </tr>
        <tr>
            <td>Manufacturer:</td>
            <td><input type="text" name="manufacturer" id="manufacturer"
                       value="${requestScope["product"].getManufacturer()}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update product"></td>
        </tr>
    </fieldset>
</form>
</body>
</html>
