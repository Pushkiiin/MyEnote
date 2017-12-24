<%@page session="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title><fmt:message key="title" /> </title>
</head>
<body>
<h1>
    <fmt:message key="heading.notes" />
</h1>
<a href="<c:url value="/createnote"/> ">Add Note</a>
<ul>
    <c:forEach items="${notes}" var="note">
        <li><c:out value="${note.title}" />
            (<a href='<c:url value="/edit-note/"/><c:out value="${note.id}"/>'>Edit</a>
            | <a href='<c:url value="/remove-note/"/><c:out value="${note.id}"/>'>Delete</a>)
        </li>
    </c:forEach>
</ul>
</body>
</html>
