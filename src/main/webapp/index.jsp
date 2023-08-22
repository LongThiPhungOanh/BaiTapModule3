<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/22/2023
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculator" method="get">
<h3>Simple Calculator</h3>
<table>
    <h5>Calculator</h5>
    <tr>
        <td>First operand</td>
        <td>Operator</td>
        <td>Second operand</td>
    </tr>
    <tr>
        <td><input type="number" name="value1"></td>
        <td><select name="optional">
            <option value="addition">addition</option>
            <option value="subtraction">subtraction</option>
            <option value="multiplication">multiplication</option>
            <option value="division">division</option>
        </select></td>
        <td><input type="number" name="value2"></td>
        <td><input type="submit" value="Calculate"></td>
    </tr>
</table>
</form>
</body>
</html>
