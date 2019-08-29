<%@ page import="java.util.*, com.shweta.model.Item" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr><td>
<tr>
<td>
<form name="LoginForm" method="post" action="AddItem">

<table>
<caption>Catlog</caption>
<tr>
<%

if(session.getAttribute("User")==null){
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.sendRedirect("Index.jsp");
%>
<%} %>
<%
Vector v=(Vector) request.getAttribute("items");
Iterator it=v.iterator();
while(it.hasNext()){
	Item item=(Item)it.next();
	%>
<tr><td cellpadding="30"><img src="<%= item.getImagepath()%>" width="250" height="350"></td>
<td cellpadding="30"><B><%= item.getDescription()%>></B></td>
<td cellpadding="30">INR<%= item.getPrice()%>></td>
<td><input type="checkbox" name="item<%= item.getId()%>" value="ON"></td></tr>

 

<%} %>
<tr>
<td>
<input type="submit" name="Purchase" value="Purchase" /></td>

<input type="submit" name="Logout" value="Logout" /></td>

 <input type="submit" value="Next" name="Purchase">
</tr>
</table>
</form>


</td>
</tr>
</table>
</body>
</html>