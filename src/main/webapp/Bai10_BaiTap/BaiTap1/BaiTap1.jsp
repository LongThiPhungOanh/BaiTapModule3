<!--
Created by IntelliJ IDEA.
User: Admin
Date: 8/21/2023
Time: 4:42 PM
To change this template use File | Settings | File Templates.
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Title</title></head>
<style>
    td, tr, th{
        width: 327px;
        color: white;
        font-family: Cambria, serif;
    }
</style>
<body style="background-color: #bd9aa0">
    <h4 style="text-align: center; color: white">Danh Sách Khách Hàng</h4>
    <table style="text-align: center; border: none">
        <tr>
            <th>Name</th>
            <th>Birth Date</th>
            <th>Address</th>
            <th>Image</th>
        </tr>
        <jsp:useBean id="customers" scope="request" type="java.util.List"/>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td><c:out value="${customer.name}"/></td>
                <td><c:out value="${customer.dateOfBirth}"/></td>
                <td><c:out value="${customer.address}"/></td>
                <td>
                <img style="height: 70px; width: 200px;" src="<c:out value="${customer.img}"/>" alt="Customer Image" />
                </td>
            </tr>

        </c:forEach>
    </table>
    </form>
</body>
</html>

