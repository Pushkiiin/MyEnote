<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr><td>Date</td><td>Note</td></tr>
    <c:forEach var="note" items="${notes}">
        <tr>

            <td><c:out value="${note.date}"></c:out></td>

            <td><c:out value="${note.content}"></c:out></td>

        </tr>
    </c:forEach>
</table>

</body>
</html>
