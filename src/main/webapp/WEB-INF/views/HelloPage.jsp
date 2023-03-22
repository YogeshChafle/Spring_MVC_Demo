<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><h1>HOME</h1></title>
</head>
<body>
	<h1>This is Home Page</h1>
	<!-- This is using Model -->
	<% 
	String name = (String) request.getAttribute("name");
	String ID = (String) request.getAttribute("ID");
	Integer Age = (Integer) request.getAttribute("Age");
	//List<String> friends= (List<String>) request.getAttribute("f"); 
	%>
	
	<h1> Name is <%=name%></h1>
	<h1> ID is <%=ID %></h1>
	<h1>My age is <%=Age %></h1>
	
	
</body>
</html>