<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<h3>${msg}</h3>
<fieldset align="center">
	<legend>Login</legend>
	<form action="./login" method="post">
	<table>
	<tr>
	<td>Id:</td>
	<td> <input name="id" type="number"></td>
	</tr>
	<tr>
	<td>Password:</td>
	<td>  <input type="password" name="password"></td>
	</tr>
	<tr>
	<td><input type="submit" value ="login"></td>
	</tr>
	<td><input type="reset" value ="Reset"><br></td>
	
	</table>
	</form>
	</fieldset>
	<a href="./register">register</a>
</body>
</html>