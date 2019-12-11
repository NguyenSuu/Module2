<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 25/11/2019
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="/bootstrap.jsp"%>
    <title>Welcome</title>
    <style>
        body{
            background-image: url("https://bom.to/KBefdR");
            background-repeat: no-repeat ;
            background-attachment:fixed ;
            background-size: 100% 100%;
        }
    </style>
</head>
<body>
<div class="container text-white">
    <h1 class="text text-warning">Welcome</h1>
    <h3>Account:${user.account}</h3>
    <h3>Name:${user.name}</h3>
    <h3>Email:${user.email}</h3>
    <h3>Age:${user.age}</h3>
</div>

</body>
</html>
