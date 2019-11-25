<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 25/11/2019
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="/bootstrap.jsp"%>
    <title>Create New Product</title>
</head>
<body>
<div class="jumbotron jumbotron-fluid">
    <div class="container">
        <h1>Create New Product</h1>
        <a href="/products" class="btn btn-primary" role="button">Back</a>
        <c:if test="${message !=null}">
            <span class="message">${message}</span>
        </c:if>
    </div>
</div>
<div class="container">
   <form:form action="new" method="post" modelAttribute="product">
       <fieldset>
           <legend>Product information</legend>
           <table>
               <tr>
                   <td><form:label path="code">Code</form:label></td>
                   <td><form:input path="code"/></td>
               </tr>
               <tr>
                   <td><form:label path="name">Name</form:label></td>
                   <td><form:input path="name"/></td>
               </tr>
               <tr>
                   <td><form:label path="price">Price</form:label></td>
                   <td><form:input path="price"/></td>
               </tr>
               <tr>
                   <td></td>
                   <td><form:button>Create product</form:button></td>
               </tr>
           </table>
       </fieldset>
   </form:form>
</div>
</body>
</html>
