<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Add</title>
</head>
<body>
<fm:form action="productAdd" commandName="product" method="post" enctype="multipart/form-data">
<fieldset>
    <legend>Product Addition:</legend>
Name<br><fm:input path="p_name" placeholder="Enter name"/><br>
Description<br><fm:input path="p_desc" placeholder="Enter Description"/><br>
Price<br><fm:input path="p_price" placeholder="Enter Price"/><br>
Image<br><input type="file" name="p_img" ><br>
<input type="submit" name="submit" value="submit">
<input type="reset" name="reset" value="reset">
  </fieldset>
</fm:form>
<table border="2">

		<thead>
			<tr>
				<td>ID</td>  	
				<td>Name</td>	
				<td>Description</td>
				<td>Price</td>
				 <td colspan=2>Action</td>
		</tr>
		</thead>

		<c:forEach var="product" items="${productList}">
			<tr>

				<td>${product.p_id}</td>
				<td>${product.p_name}</td>
				<td>${product.p_desc}</td>
				<td>${product.p_price}</td>
				
				<td><a href="product_edit/${product.p_id}">Edit</a></td>
					
					<td><a href="<c:url value='/delete_Product/${product.p_id}' />" >Delete</a></td>

			</tr>
		</c:forEach>

	</table>


</body>
</html>