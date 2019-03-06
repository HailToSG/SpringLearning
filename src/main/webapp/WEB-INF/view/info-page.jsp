<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>User's personal</title>
</head>
<%--@elvariable id="user" type="itc.srpringmvc.demo"--%>
<body><h2>User's personal</h2>
${user.firstName} <br/>
${user.lastName} <br/>
${user.country} <br/>
${user.age}

<ul>
    <c:forEach var ="tmp" items="${user.choosenRights}">
        <li>${tmp}</li>
    </c:forEach>

</ul>
</body>
</html>
