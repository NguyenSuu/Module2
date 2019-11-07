<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 04/11/2019
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <style>
        .row{
            width: 100%;
            clear: both;
        }
        .right{
            width: 350px;
            height: 50px;
            float: left;
            display: flex;
            align-items: center;

        }
        .left{
            float: left;
            width: 200px;

        }
    </style>
</head>
<body>
<h1>Simple Calculator</h1>
<form method="post" action="calculator">
    <fieldset>
        <legend>Calculator</legend>
        <div class="row">
            <div class="left">
                <p>First operand:</p>
            </div>
            <div class="right">
                <input name="firstOperand" type="text">
            </div>
        </div>
      <div class="row">
        <div class="left">
          <p>Operator:</p>
        </div>
        <div class="right">
          <select name="Calculator">
            <option value="+">Addtion</option>
            <option value="-">Subtraction</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
          </select>
        </div>
      </div>
      <div class="row">
        <div class="left">
          <p>Second operand:</p>
        </div>
        <div class="right">
          <input name="secondOperand" type="text">
        </div>
      </div>
        <div class="row">
            <div class="left">
                <p></p>
            </div>
            <div class="right">
                <button>Calculate</button>
            </div>
        </div>
    </fieldset>

</form>
</body>
</html>
