<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body><h2>Give us your personal data</h2>
<%--@elvariable id="user" type="itc.srpringmvc.demo"--%>
<form:form action="processForm" modelAttribute="user">
    Call your name: <form:input path="firstName"/><br/>
    Call your lastname: <form:input path="lastName"/><br/>
    What is your country: <form:select path="country">
    <form:options items="${user.countryOptions}"/>
</form:select>

    
    <br/>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
