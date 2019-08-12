<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*, com.shweta.model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<caption>User Information</caption>
<tr>
<%

	


User user= (User)session.getAttribute("UserInfo");

	%>
	
	



<tr><td>Name =<%= user.getName()  %></td>
<tr><td>Sirname =<%= user.getSirname()  %></td>
<tr><td>User Name =<%= user.getUserName()  %></td>
<tr><td>Address =<%= user.getAddress()  %></td>

</tr>


</table>


</body>
</html>