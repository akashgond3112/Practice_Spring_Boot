<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Student registration</title>
</head>

<body>
<main>
    <form:form action="processForm" modelAttribute="student">
        First Name : <form:input path="firstName"/>
        <br><br>
        Last Name : <form:input path="lastName"/>
        <br><br>
        Country :
        <form:select path="country">
            <form:options items="${countryOptions}"/>

        </form:select>
        <br><br>
        Favorite Language :
        Java <form:radiobutton path="favoriteLanguage" value="Java"/>
        C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
        PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
        Python <form:radiobutton path="favoriteLanguage" value="Python"/>
<%--        <br><br>--%>
<%--        Operating System :--%>
<%--        Linux : <from:checkbox path="operatingSystem" value="Linux"/>--%>
<%--        Mac OS : <from:checkbox path="operatingSystem" value="Mac OS"/>--%>
<%--        Windows : <from:checkbox path="operatingSystem" value="Windows"/>--%>
        <br><br>
        <input type="submit" value="Submit"/>


    </form:form>
</main>
</body>

</html>