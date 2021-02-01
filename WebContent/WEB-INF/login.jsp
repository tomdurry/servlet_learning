<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
<h1>Login Form</h1>
<form action="sample" method="post" id="my-form">
			<table style="with: 50%">
				<tr>
					<td>UserID</td>
					<td><input type="text" name="userid" id="name"/></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" id="pass"/></td>
				</tr></table>
			<input type="submit" value="Submit" id="sub"/></form>
			<script src="/spring_learning/js/login.js"></script>
</body>
</html>