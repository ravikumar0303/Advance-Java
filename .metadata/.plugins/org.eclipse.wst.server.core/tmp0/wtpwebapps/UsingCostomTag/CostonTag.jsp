<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="mytag" uri="/calculate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
   String n1="4";
   String n2="25";
 %>
   <mytag:mycalculate n1="<%=n1%>" n2="<%=n2%>"></mytag:mycalculate>
</body>
</html>