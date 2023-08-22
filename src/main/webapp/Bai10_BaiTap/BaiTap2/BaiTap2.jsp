<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/22/2023
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Result</h3>
<div><c:out value="${value1}"/> <c:out value="${optional}"/> <c:out value="${value2}"/> = <c:out value="${result}"/></div>
</body>
</html>
