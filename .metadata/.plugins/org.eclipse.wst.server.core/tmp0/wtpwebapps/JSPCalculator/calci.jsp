<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>calci</title>
</head>
<body>
	<%
	int num = Integer.parseInt(request.getParameter("num"));
	String btn = request.getParameter("btn");
	switch (btn) {

	case "fact":
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
			
		}
		out.println("<br><h1><center>factorial: "+fact+"</center></h1>");
		break;
	case "squ":
		out.println("<h1><center> Square: "+num*num+"</center></h1>");
		break;
	case "cube":
		out.println("<h1><center> cube: "+num*num*num+"</center></h1>");
		break;
	}
	
		
	%>
</body>
</html>