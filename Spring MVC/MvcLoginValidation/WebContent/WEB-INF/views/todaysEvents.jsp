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
      <div class="event" style="text-align:center;">
        <event>
          Name:Puppet Show<br>
          Organised By:Murugan<br>
          Time:17.00<br>
          <br>
          Name:Magic Show<br>
          Organised By:James<br>
          Time:19.00<br>
          <br>
          Name:Music Show<br>
          Organised By:Jack<br>
          Time:23.00 <br>
        </event>
      </div>
</body>
</html>