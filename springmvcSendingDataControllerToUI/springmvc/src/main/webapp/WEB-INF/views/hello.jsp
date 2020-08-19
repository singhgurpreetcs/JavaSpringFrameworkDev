<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>
	<H1>Hello From Java Spring APP</H1>
	<% 
		Integer ing = (Integer) request.getAttribute("id");
		String str = (String) request.getAttribute("Name");
		out.println(ing);
		out.println(str);
	%>
	<br />
	ID:<b>${id})</b>
	Name:<b>${Name}</b>
</body>
</html>