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
    <title>Create products</title>
</head>

<body>
<p>
    <a href="/products">Come back products</a>
</p>

<c:if test='${requestScope["message"]!= null}'>
    <span>${requestScope["message"]}</span>
</c:if>
    <form method="post">
    <fieldset>
        <legend>Product Information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Cost:</td>
                <td><input type="text" name="cost"></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><input type="text" name="description"></td>
            </tr>
            <tr>
                <td>Manufacturer</td>
                <td><input type="text" name="manufacturer"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
