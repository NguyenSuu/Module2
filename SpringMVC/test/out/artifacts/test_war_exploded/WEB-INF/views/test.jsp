<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 22/11/2019
  Time: 08:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/libOnline.jsp"%>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
    <ul class="navbar-nav">
       <li class="nav-item active">
           <a href="/test" class="nav-link">Test</a>
       </li>
        <li class="nav-item">
            <a class="nav-link" href="/test2">Test 2</a>
        </li>
    </ul>
</nav>
<div class="container">
    <p>Goodbye</p>
    <p>${txt}</p>
</div>
</body>
</html>
