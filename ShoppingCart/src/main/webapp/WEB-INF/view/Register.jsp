<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Kro BC</title>
</head>
<body>
hello ji
<fm:form action="useradd" commandName="user">
<fieldset>
    <legend>Login information:</legend>
Email<br><input type="text" name="name" placeholder="Enter email"><br>
Password<br><input type="password" name="pwd" placeholder="Enter password"><br>
Contact<br><input type="text" name="contact" placeholder="Enter Contact Number"><br>

<input type="submit" name="submit" value="submit">
<input type="reset" name="reset" value="reset">

  </fieldset>
</fm:form>
</body>
</html>