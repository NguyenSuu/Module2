<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 26/11/2019
  Time: 08:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product Form</title>
</head>
<body>
<div>
    <a href="/view">back</a>
</div>
<form:form action="create" method="post" modelAttribute="product">

    <fieldset>
        <legend>Information Product</legend>
        <table>
            <tr>
                <td><form:label path="code">Code</form:label></td>
                <td><form:input path="code"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="name">Code</form:label></td>
                <td><form:input path="name"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="price">Code</form:label></td>
                <td><form:input path="price"></form:input></td>
            </tr>
            <form:button>Submit</form:button>
        </table>
    </fieldset>

</form:form>

</body>
</html>
