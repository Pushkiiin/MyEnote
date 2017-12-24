<%@page session="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title><fmt:message key="title" /> </title>
</head>
<>
<h1>
    <fmt:message key="heading.note" />
</h1>
<c:url value="/createnote" var="submitAction" />
<form:form method="post" action="${submitAction}" modelAttribute="note">
    <form:hidden path="id"/>
    Title:
    <form:input path="title"/>
    <br />
    Content:
    <br />
    <form:textarea path="content" rows="12" cols="65" />
    <br />
    <input type="submit" value="Save">
</form:form>
<a href="<c:url value="/notes"/>">Home</a>
</body>
</html>
