<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 25/11/2019
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%@ include file="/bootstrap.jsp" %>
    <title>Product list</title>
</head>
<body>
<div class="jumbotron jumbotron-fluid">
    <div class="container">
        <h1>Product</h1>
        <a href="/create" class="btn btn-info">Add new product</a>
        <p>There are ${products.size()} products in the list</p>
    </div>
</div>
<div class="container">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Code</th>
                <th>Name</th>
                <th>Price</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="product" items="${products}">
                <tr>
                    <td>${product.getCode()}</td>
                    <td><a href="/view?id=${product.getId()}">${product.getName()}</a></td>
                    <td>${product.getPrice()}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
</div>
<%--<div class="modal" id="myModal">--%>
<%--    <div class="modal-dialog">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h4 class="modal-title">Information Product</h4>--%>
<%--                <button type="button" class="close" data-dismiss="modal">&times;</button>--%>
<%--            </div>--%>
<%--            <div class="modal-body">--%>
<%--                <form>--%>
<%--                    <div class="form-group">--%>
<%--                        <label>Code</label>--%>
<%--                        <p>${product.getCode()}</p>--%>
<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <label>Name</label>--%>
<%--                        <p>${product.getName()}</p>--%>
<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <label>Price</label>--%>
<%--                        <p>${product.getPrice()}</p>--%>
<%--                    </div>--%>
<%--                </form>--%>
<%--            </div>--%>
<%--&lt;%&ndash;            <div class="modal-footer">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <button type="button" class="btn btn"&ndash;%&gt;--%>
<%--&lt;%&ndash;            </div>&ndash;%&gt;--%>
<%--        </div>--%>
<%--    </div>--%>

<%--</div>--%>
</body>
</html>
