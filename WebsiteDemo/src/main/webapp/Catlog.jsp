<%@ page import="java.util.*,model.Item" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
HttpSession sessionCatlog=request.getSession();
int a=(Integer) session.getAttribute("S1");
String str=String.valueOf((session.getAttribute("S2")));
int k=(Integer)request.getAttribute("items");
%>

<br>

Hello
<br>
welcome session =<%= a	%>
<br>
Welcome Addition = <%= k	%>
<br>
 Welcome Shweta = <%= str %>

${S2}
${sky}
${items}

</body>
</html>