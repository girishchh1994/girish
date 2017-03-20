<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Category Add</title>
</head>
<body>
${msg}

<form:form action="categoryAdd" commandName="category" modelAttribute="category" method="post" >
<fieldset>
    <legend>Category Addition:</legend>
<table>
<tr>
		
			<c:if test="${!empty category.c_name}">
    <td>ID of the brand:</td>
        <td><form:input path="c_id" type="number" name="c_id" readonly="true" /></td>
         <form:hidden path="c_id"/>
        
  
    </c:if>
	</tr>
			<tr>
				<td>Name of the Category:</td>
			<td><form:input path="c_name" type="text" name="c_name" required="true"/></td>
			</tr>
			<tr>
				<td>Description of the Category:</td>
			<td><form:input path="c_desc" type="text" name="c_desc" required="true"/></td>
			</tr>
			
				
			<tr>
				<td colspan="2"><c:if test="${!empty category.c_name}">
						<input type="submit" value="<spring:message text="Update Category"/>" />
					</c:if> <c:if test="${empty category.c_name}">
						<input type="submit" value="<spring:message text="Add Category"/>" />
					</c:if></td>
			</tr>
		</table>
	<br></br>
  </fieldset>
</form:form>

<table border="2">

		<thead>
			<tr>
				<td>ID</td>  	
				<td>Name</td>	
				<td>Description</td>
				 <td colspan=2>Action</td>
		</tr>
		</thead>

		<c:forEach var="category" items="${categoryList}">
			<tr>

				<td>${category.c_id}</td>
				<td>${category.c_name}</td>
				<td>${category.c_desc}</td>
				<td><a href="edit_Category/${category.c_id}">Edit</a></td>
					
					<td><a href="<c:url value='/delete_Category/${category.c_id}' />" >Delete</a></td>

			</tr>
		</c:forEach>

	</table>


</body>
</html>