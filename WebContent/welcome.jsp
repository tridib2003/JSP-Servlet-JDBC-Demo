<!--
	~ author : @tridib2003
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ page import = "com.login.*" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
		
		response.setHeader("Pragma", "no-cache"); // HTTP 1.0
		
		response.setHeader("Expires", "0"); // Proxy server's
		
		if (session.getAttribute("username") == null)
		{
			response.sendRedirect("login.jsp");
		}
	%>

	<h2>Welcome ${username} </h2>
	
	View products <a href="products.jsp">here</a>
	
	<br><br>
	
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
	
</body>
</html>