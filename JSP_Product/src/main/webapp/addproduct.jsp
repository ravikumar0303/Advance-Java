<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
<br>
<h1>Add New Product !!</h1>
<br><br>
<body>
<table border="2">
<td>
	<form action="addproduct" method="post">
	Product id: <input type="text" name="pid" id="pid" ><br></br>
	Product name: <input type="text" name="pname" id="pname" ><br></br>
	Quantity: <input type="text" name="qty" id="qty" ><br></br>
	Price:<input type="text" name="price" id="price" ><br></br>
	
	<button type="submit" name="btn" id="btn" value="add">Add New Product</button>
	<br>
	</form>
	</table>
</body>
</td>
</center>
</html>