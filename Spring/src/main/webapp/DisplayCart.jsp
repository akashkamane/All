<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
<%-- <%@ page import="java.util.*, com.shweta.model.*" %> --%>
<%
if(session.getAttribute("User")==null){
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.sendRedirect("Index.jsp");
}
%>
<%-- <%
Cart cart = (Cart)session.getAttribute("cart");
Collection cartItems=cart.getCartItems();
Iterator it=cartItems.iterator();
%> --%>
<table>
<form method="get" action="Decision">
<caption>Your Cart</caption>
<tr>

<th>Item Purchase</th>
<th>Quantity</th>
<th>Item Rate</th>
<th>Item Remove</th>
</tr>
<%-- <%
	while(it.hasNext())
	{
	CartItem cartItem=(CartItem)it.next();
	%>
	<tr>
	<td>	
	<%= cartItem.getItem().getDescription() %></td>
	<td>
	<input type="text" name="T<%= cartItem.getCartItemId() %>" size="1" value="<%= cartItem.getQuantity() %>"></td>
	<td>INR<%= cartItem.getItem().getPrice() %></td>
	<td><input type="checkbox" name="<%=cartItem.getCartItemId() %>"value="on"></td>
<% } %> --%>

<tr>
<td colspan="2">TOTAL AMOUNT</td>
<%-- <td>INR<%= cart.getCartValue() %> --%>

</tr>

<td><input colspan="4" type="submit" value="Update Cart" name="update">
<input type="submit" value="Shop More" name="shop">
<input type="submit" value="freeze Cart" name="freeze">

<input type="submit" value="User Info" name="Registration">

 <input type="submit" value="logout" name="Logout" >
 
</td>

</form>

</table>

</body>
</html>