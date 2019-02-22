<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>User's personal</title>
</head>
<%--@elvariable id="user" type="itc.srpringmvc.demo"--%>
<body><h2>User's personal</h2>
${user.firstName} <br/>
${user.lastName} <br/>
${user.country}
</body>
</html>
