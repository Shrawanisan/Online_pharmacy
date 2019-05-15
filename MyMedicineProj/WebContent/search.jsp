<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
	<a href="new"><button>Add Medicine</button></a>
</div>

<br><br><br><br>
<table border="1" cellpadding="5">
	<tr>
	<th>Id</th>
		<th>Name</th>
		<th>Type</th>
		<th>Unit Value</th>
		<th>Unit</th>
		<th>Price</th>
				<th>In Stock</th>
				<th>Actions</th>
		
	</tr>
	<c:forEach var="medicine" items="${listmedicine}">
	<tr>
		<td><c:out value="${medicine.id}"/></td>
		<td><c:out value="${medicine.name}"/></td>
		<td><c:out value="${medicine.type}"/></td>
		<td><c:out value="${medicine.unitValue}"/></td>
			<td><c:out value="${medicine.unit}"/></td>
				<td><c:out value="${medicine.price}"/></td>
				<td><c:out value="${medicine.inStock}"/></td>
		
		<td><a href="edit?id=<c:out value="${medicineList}"/>"><button type="button">Edit</button></a></td>
				
		<td><a href="delete?id=<c:out value="${medicineList}"/>"><button type="button">Delete</button></a></td>
	</tr>
	</c:forEach>
</table>
	</body>
	</html>