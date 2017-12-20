<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Account</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/createaccount">

    <table>
        <tr><td>Login: </td><td><input name="login" type="text"/></td></tr>
        <tr><td>Password: </td><td><input name="password" type="text"/></td></tr>
        <tr><td>Confirm password: </td><td><input name="confirmpass" type="text"/></td></tr>
        <tr><td></td><td><input value="Create account" type="submit"/></td></tr>
    </table>


</form>

</body>
</html>
