

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

<c:if test="${medicine != null}">
	<form action="update" method="get">
	<input type="hidden" name="id" value=" <c:out value='${medicine.id}'/>">
 	</c:if>
 	<c:if test="${medicine == null}">
	<form action="insert" method="get">
 	</c:if>

		
		
		<label>Name</label>
		<input type="text" name="name" value="<c:out value='${medicine.name}'/>">
		<br>
		
		<label>Type</label>
		<input type="text" name="type" value="<c:out value='${medicine.type}'/>">
		<br>
		
		<label>Unit Value</label>
		<input type="text" name="unitValue" value="<c:out value='${medicine.unitValue}'/>">
		<br>
		
		<label>Unit</label>
		<input type="text" name="unit" value="<c:out value='${medicine.unit}'/>">
		<br>
		
		
		<label>Price</label>
		<input type="text" name="price" value="<c:out value='${medicine.price}'/>">
		<br>
		
			<label>Expiry Date</label>
		<input type="text" name="expiryDate" value="<c:out value='${medicine.expiryDate}'/>">
		<br>
		
		<label>In Stock</label>
		<input type="checkbox" name="inStock" value="<c:out value='${medicine.inStock}'/>">
		<br>
		
		
		<button type="submit" value="save">Submit</button>
	</form>







<!-- <form>
<h2>Add Medicine</h2>



<table style="width: 100%">
<tr>
    <th>Name</th>
    <th>Type </th>
    <select id="sel">
    <option value="abc">Abc</option>
     <option value="abc">Abc</option>
      <option value="abc">Abc</option>
       <option value="abc">Abc</option>
       </select>

  
  </tr>
  <tr>
    <td id="nm">jill</td>
    <td id="nm">tom</td>
   
  </tr>
  <tr>
    <th>Unit Value
    
    </th>
  
    <th>Price</th> 
  
  </tr>
  
  <tr>
    <td id="nm">Eve</td>
    <td id="nm">Jackson</td>
   
  </tr>
  <tr>
    <td> <input id="inp" type="radio" name="gender" value="mg" checked> mg
  <input id="inp"  type="radio" name="gender" value="gm"> gm
  <input id="inp"  type="radio" name="gender" value="ml"> ml
  <input id="inp" type="radio" name="gender" value="l"> l</td></tr>
   <tr>
    <th> Expiry Date</th>
     <th>In Stock</th>
  
     </tr>
 
  <tr>
    <td id="nm">John</td>
      <td><input id="bor" type="checkbox" name="vehicle" value="In Stock"><br>
       
   </td>
      </tr>
      <tr>
      <td><button id="medi"  type="submit">Save</button>
   <button id="medi" type="submit">Cancel</button>
   </td></tr>

	</form> -->
</body>
</html>