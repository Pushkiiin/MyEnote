<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/docreate">

    <table>
        <tr><td>Note: </td><td><textarea name="content" rows="10" cols="10"></textarea> </td></tr>
        <tr><td></td><td><input value="Create note" type="submit"/></td></tr>
    </table>


</form>

</body>
</html>
