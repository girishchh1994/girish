<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
<fm:form action="validate" method="post">
<fieldset>
    <legend>Login information:</legend>
Email<br><input type="text" name="email" placeholder="Enter email"><br>
Password<br><input type="password" name="password" placeholder="Enter password"><br>
<input type="submit" name="submit" value="submit">
  </fieldset>
</fm:form>
</body>
</html>