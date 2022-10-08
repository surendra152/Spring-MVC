<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successful</title>
</head>
<body>
	
	<h3 class="text-center">${Header}</h3>
	<p class="text-center">${Desc}</p>
	<p style="color: green">${msg }</p>
	<hr>
	<div class="container text-center">
		<h1>Welcome ${user.userName}</h1>
		<h2>Your mail id is ${user.email}</h2>
		<h3>Your password id is ${user.userPassword} try to secure the password</h3>
		
		
	</div>
	
	
</body>
</html>