<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 04/11/2019
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>c:out example</h2>
  <c:out value="${'This is true: 10 > 1 '}" />
  <br/>
  Tag: <c:out value="${'<atag> , &'}"/>
  </body>
</html>
