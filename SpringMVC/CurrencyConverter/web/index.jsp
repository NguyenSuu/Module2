<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 22/11/2019
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <%@ include file="bootstrap.jsp"%>
    <title>Form Convert</title>
  </head>
  <body>
  <div class="container">
    <form action="/convert">
      <p>Enter amount of USD you want to convert</p>
      <input type="text" name="number" id="number">
      <input type="submit" value="Submit">
    </form>
  </div>
  </body>
</html>
