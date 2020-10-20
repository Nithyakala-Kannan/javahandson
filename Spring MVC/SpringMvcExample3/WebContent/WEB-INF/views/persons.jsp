<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form:form action="${pageContext.request.contextPath}/persons/process" modelAttribute="person">
		firstName<form:input path="firstName"/><span><form:errors path="firstName"></form:errors></span><br>
		
		lastName<form:input path="lastName"/><span><form:errors path="lastName"></form:errors></span><br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>