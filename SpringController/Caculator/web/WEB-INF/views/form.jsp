<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 26/11/2019
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <h1>Caculator</h1>
    <form action="/caculator" method="get">
        <p>
            <input type="text" name="first">
            <input type="text" name="second">
        </p>
        <p>
            <input type="submit" name="caculator" value="Addition(+)">
            <input type="submit" name="caculator" value="Subtraction(-)">
            <input type="submit" name="caculator" value="Multiplication(*)">
            <input type="submit" name="caculator" value="Division(/)">
        </p>
    </form>
<p>${result}</p>
</body>
</html>
