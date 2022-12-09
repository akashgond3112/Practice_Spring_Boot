<%--
  Created by IntelliJ IDEA.
  User: akash
  Date: 12/9/2022
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<html>
<head>
    <title>Student confirmation</title>
</head>
<body>
The student confirmation : ${student.firstName} ${student.lastName}
<br><br>
Country: ${student.country}
<br><br>
Favorite Language: ${student.favoriteLanguage}
<br><br>
<%--Operating System:--%>
<%--<ul>--%>
<%--    <c:forEach var="temp" items="${student.operatingSystem}">--%>
<%--        <li>${temp}</li>--%>
<%--    </c:forEach>--%>
<%--</ul>--%>
</body>
</html>
