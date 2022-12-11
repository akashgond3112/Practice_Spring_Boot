<%--
  Created by IntelliJ IDEA.
  User: akash
  Date: 12/11/2022
  Time: 10:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer form</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<form:form modelAttribute="customer" action="processForm">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name (*) : <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>
    <input type="submit" value="submit"/>
</form:form>

</body>
</html>
