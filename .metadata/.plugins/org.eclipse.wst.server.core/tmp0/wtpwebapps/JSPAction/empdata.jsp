<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="com.IET.beans.Employee" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body align="center">
   <br><br>
     <jsp:useBean id="e" class="com.IET.beans.Employee" scope="session"></jsp:useBean>
     <jsp:setProperty property="*" name="e"></jsp:setProperty>
     
     <b>Eid:<jsp:getProperty property="eid" name="e"></jsp:getProperty><b> <%-- <%= e.getEid() %> --%> 
    <b> Ename:<jsp:getProperty property="ename" name="e"></jsp:getProperty>  <%-- ---${e.ename}--%> 
    <b> Salary:<jsp:getProperty property="sal" name="e"></jsp:getProperty>
     
</body>
</html>