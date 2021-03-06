<!--
	~ author : @tridib2003
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
	
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
	
		response.setHeader("Pragma", "no-cache"); // HTTP 1.0
	
		response.setHeader("Expires", "0"); // Proxy server's	
	
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	%>

	<h2>Products</h2>
	
	<br>
	
	<div class="github-card" data-github="tridib2003/JSP-Servlet-Demo" data-width="400" data-height="150" data-theme="default"></div>
	<script src="//cdn.jsdelivr.net/github-cards/latest/widget.js"></script>
	
	<br>
	
	<form action="welcome.jsp">
		<input type="submit" value="Go back">
	</form>
	
</body>
</html>