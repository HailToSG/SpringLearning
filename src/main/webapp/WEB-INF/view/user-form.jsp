<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
    <style>
        .error{color: #ff5500}
    </style>
</head>
<body><h2>Give us your personal data</h2>
<%--@elvariable id="user" type="itc.srpringmvc.demo"--%>
<form:form action="processForm" modelAttribute="user">
    Your name: <form:input path="firstName"/><br/>
    Your lastname(*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/><br/>
    Your e-mail(*): <form:input path="eMail"/>
    <form:errors path="eMail" cssClass="error"/><br/>
    What is your country: <form:select path="country">
    <form:options items="${user.countryOptions}"/><br/>
</form:select><br/>

    What is your age:<br/>
    <form:radiobuttons items="${user.ageScale}" path="age"/><br/>
    <form:errors path="age" cssClass="error"/><br/>

    Salary: <form:input path="salary"/><br/>
    <form:errors path="salary" cssClass="error"/><br/>

    Rights:<br/>
    <form:checkboxes items="${user.rights}" path="choosenRights"/>
    <form:errors path="choosenRights" cssClass="error"/><br/>
    <br/>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
