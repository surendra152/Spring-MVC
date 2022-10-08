<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>welcome to home page</h1>
	<h1>called by home controller</h1>
	<%
	
		String name=(String)request.getAttribute("name");
		Integer n=(Integer)request.getAttribute("Id");
		List<String> friends= (List<String>) request.getAttribute("f");
		
	%>
	
	<h1>my name is <%=name %> </h1>
	<h1>my ID is <%=n %> </h1>
	
	<%
		for(String e:friends)
		{
	%>
	
		<h1><%=e %></h1>
		
	
	<%
		}
	%>
		
	
	
	
</body>
</html>