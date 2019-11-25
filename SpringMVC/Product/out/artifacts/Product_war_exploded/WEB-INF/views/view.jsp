<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 25/11/2019
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="/bootstrap.jsp"%>
    <title>View product details</title>
</head>
<body>
<h1>Product details</h1>
<a href="/products">Back to product list</a>
<table>
    <tr>
        <td>Code: </td>
        <td>${product.getCode()}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${product.getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${product.getPrice()}</td>
    </tr>
</table>

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
<%--                        <p>${requestScope["product"].getCode()}</p>--%>
<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <label>Name</label>--%>
<%--                        <p>${requestScope["product"].getName()}</p>--%>
<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <label>Price</label>--%>
<%--                        <p>${requestScope["product"].getPrice()}</p>--%>
<%--                    </div>--%>
<%--                </form>--%>
<%--            </div>--%>
<%--            &lt;%&ndash;            <div class="modal-footer">&ndash;%&gt;--%>
<%--            &lt;%&ndash;                <button type="button" class="btn btn"&ndash;%&gt;--%>
<%--            &lt;%&ndash;            </div>&ndash;%&gt;--%>
<%--        </div>--%>
<%--    </div>--%>

<%--</div>--%>
</body>
</html>
