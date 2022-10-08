<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help</title>
</head>
<body>
	<h1>Welcome to the helpline service</h1>
	
	<%
		/*String name=(String)request.getAttribute("name");
		Integer roll=(Integer)request.getAttribute("rollno");
		LocalDateTime date=(LocalDateTime)request.getAttribute("Date");
		*/
		
	%>
	
	<h1>My name is ${name} </h1> 
	<h1>My rollno is ${rollno} </h1>
	<h2>todays day and time : ${Date}</h2>
	
	<hr>
	
		
		<c:forEach var="item" items="${marks}">
			
				<h1>${item}</h1>
				
		</c:forEach>
	
</body>
</html>