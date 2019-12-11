<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 25/11/2019
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="/bootstrap.jsp"%>
    <title>Login</title>
    <style>
        body{
            background-image: url('https://bom.to/AsqxuW');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: 100% 100%;
        }
        .container{
            color: whitesmoke;
            margin: 300px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1 style="margin-left:100px ">Login</h1>

<form:form action="login" method="post" modelAttribute="login">
    <fieldset>
        <table>
            <tr>
                <td style="color: whitesmoke;text-align: right"><form:label path="account">Account:</form:label></td>
                <td><form:input path="account"/></td>
            </tr>
            <tr>
                <td style="color: whitesmoke"><form:label path="password">Password:</form:label></td>
                <td><form:input path="password"/></td>
            </tr>
            <tr>

                <td></td>
                <td class="text-warning"><c:if test="${message !=null}">
                    <span class="message">${message}</span>
                </c:if></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button>Login</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</div>
</body>
</html>
