<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.List,com.IET.beans.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>

<body >
<center>
<h1>Product List !!!</h1>
<% 
	List<Product> plist=(List<Product>)request.getAttribute("plist");
	
	%>
	
	<table border="2px">
	<tr><th>Product Id </th> 
	<th>Product Name </th> 
	<th>Product Quantity </th>
	<th>Price </th>
	<th>Updation</th>
	</tr>
	<%
		for(Product p:plist)
		{
	%>
		<tr>
		<td><%=p.getPid() %> </td>
		<td> <%=p.getPname() %></td>
		<td><%=p.getQty() %> </td>
		<td> <%=p.getPrice() %></td>
		<td>
		<a href="edit?pid=<%=p.getPid() %>">edit </a>/
		<a href="delete?pid=<%=p.getPid() %>">delete </a>
		</td>
		
		</tr>		
	<%
		}
	%>

	
	</table>
		<br><br>
<b>	<a href="addproduct.jsp">Add Product!!</a></b>
	</center>
</body>

</html>