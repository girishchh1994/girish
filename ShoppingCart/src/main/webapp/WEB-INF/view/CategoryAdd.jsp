<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Category Add</title>
</head>
<body>
<fm:form action="categoryAdd" commandName="category" method="post" >
<fieldset>
    <legend>Category Addition:</legend>
Name<br><fm:input path="c_name" placeholder="Enter name"/><br>

<input type="submit" name="submit" value="submit">
<input type="reset" name="reset" value="reset">
  </fieldset>
</fm:form>
<table border="2">

		<thead>
			<tr>
				<td>ID</td>  	
				<td>Name</td>	
				 <td colspan=2>Action</td>
		</tr>
		</thead>

		<c:forEach var="category" items="${categoryList}">
			<tr>

				<td>${category.c_id}</td>
				<td>${category.c_name}</td>
		
				
				<td><a href="edit_Category/${category.c_id}">Edit</a></td>
					
					<td><a href="<c:url value='/delete_Category/${category.c_id}' />" >Delete</a></td>

			</tr>
		</c:forEach>

	</table>


</body>
</html>