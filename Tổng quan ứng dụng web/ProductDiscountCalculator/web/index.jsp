<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 01/11/2019
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <style>
    #main{
      width: 554px;
      border: 2px solid blue;
      height: 300px;
      padding: 10px;
    }
    .row {
      width: 100%;
      clear: both;
    }
    .left{
      width: 200px;
      float: left;
    }
    .right{
      width: 350px;
      height: 50px;
      float: right;
      display: flex;
      align-items: center;
    }
    #top{
      text-align: center;
    }
    button {
      padding: 10px;
    }


  </style>
  <body>
  <form action="display-discount" method="get">
  <div id="main">
    <div id="top">
      <h2>Product Discount Calculator</h2>
    </div>
    <div id="bottom">
      <div class="row">
        <div class="left">
          <p>Product Description:</p>
        </div>
        <div class="right">
          <input name="Product Description" type="text">
        </div>

      </div>
      <div class="row">
        <div class="left">
          <p>List Price:</p>
        </div>
        <div class="right">
          <input name="List Price" type="text">
        </div>

      </div>
      <div class="row">
        <div class="left">
          <p>Discount Percent:</p>
        </div>
        <div class="right">
          <input name="Discount Percent" type="text">(%)
        </div>

      </div>
      <div class="row">
        <div class="left">
          <p></p>
        </div>
        <div class="right">
        <button>Calculate Discount</button>
        </div>

      </div>


      </div>
    </div>
  </div>
  </form>
  </body>
</html>
