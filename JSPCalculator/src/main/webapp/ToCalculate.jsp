<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DoCalculate</title>
</head>
<body>
	<%
	int n1 = Integer.parseInt(request.getParameter("num1"));
	int n2 = Integer.parseInt(request.getParameter("num2"));
	String btn = request.getParameter("btn");
	switch (btn) {
	case "add":
		int sum = n1 + n2;
		out.println("<h1><center>Addition: " + sum + "</h1>");
		break;
	case "sub":
		out.println("<h1><center>sub: " + (n1 - n2) + "</h1>");
		break;
	case "mul":
		out.println("<h1><center>multiplication: " + (n1 * n2) + "</h1>");
		break;
	case "div":
		out.println("<h1><center>Division: " + (n1 / n2) + "</h1>");
		break;

	}
	%>


</body>
</html>