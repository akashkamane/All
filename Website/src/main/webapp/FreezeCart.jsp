<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Cart cart = (Cart)session.getAttribute("cart");

%>
<%@ page import="java.util.*, com.shweta.model.*" %>
 we hope you enjoy your shopping
 <%

HttpSession sessionLog=request.getSession();
 
if(session.getAttribute("User")==null){

response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.sendRedirect("Index.jsp");
	
}
%>




Your total INR amount is <%= cart.getCartValue() %>
 
<a href="/Website/Index.jsp">HOME PAGE</a> 
<form action="Logout">
 <input type="submit" value="logout" >
 
 
  
  
</body>
</html>