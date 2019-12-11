<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 26/11/2019
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="save" method="get">
    <input type="checkbox" value="Lettuce" name="condiment">Lettuce
    <br>
    <input type="checkbox" value="Tomato" name="condiment">Tomato
    <br>
    <input type="checkbox" value="Mustard" name="condiment">Mustard
    <br>
    <input type="checkbox" value="Sprouts" name="condiment">Sprouts
    <br>
    <input type="submit" value="Save">
</form>
</body>
</html>
