<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>
		<h1>Enriching Entertainment</h1>
	</header>
	<a href="${pageContext.request.contextPath}/contactUs">Contact Us</a>
	<a href="${pageContext.request.contextPath}/login">Login</a>
	<a href="${pageContext.request.contextPath}/todaysEvents">Today's Event</a>
 <div class="form" style="text-align:center;">
 <h4>Login</h4>
 <form>
    UserName:<input type="text" name="username">
    Password:<input type="text" name="password">
    <input type="submit" value="Submit">
 </form>
 </div>
</body>
</html>