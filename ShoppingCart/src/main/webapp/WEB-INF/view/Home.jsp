<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page isELIgnored="false"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Liquor Shop</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<h1>My Liquor Shop</h1><br><br>
<jsp:include page="Header.jsp"></jsp:include><br><br>
<a href="Home">Home</a>
<c:if test="${empty loginMessage }">
<a href="Login">Login</a>
<a href="Register">Register</a>

</c:if>
<c:if test="${not empty loginMessage }">
<a href="Logout">Logout</a>
</c:if>
<a href = "Product">Product Add</a>
<br>
<a href = "Category">Category Add</a>
<br>
<a href = "Supplier">Supplier Add</a>
<br>
${successMessage } ${errorMessage }
<br>
${loginMessage}
<hr>
<c:if test="${loginClicked==true or not empty errorMessage}">
<jsp:include page="Login.jsp"></jsp:include>
</c:if>
<c:if test="${registerClicked==true }">
<jsp:include page="Register.jsp"></jsp:include>
</c:if>
<jsp:include page="Carousel.jsp"></jsp:include>
<br>
<br>
<br>

<div class="col-xs-12 col-md-8">
 <div class="row">
  <div class="col-xs-4 col-md-4">
  <img src="resources/images/rum.jpg" class="img-responsive" alt="Logo">
  </div>
  <div class="col-xs-4 col-md-4">
  <img src="resources/images/rum.jpg" class="img-responsive" alt="Logo">
  </div>
  <div class="col-xs-4 col-md-4">
  <img src="resources/images/rum.jpg" class="img-responsive" alt="Logo">
  </div>

 </div>
</div></body>
</html>