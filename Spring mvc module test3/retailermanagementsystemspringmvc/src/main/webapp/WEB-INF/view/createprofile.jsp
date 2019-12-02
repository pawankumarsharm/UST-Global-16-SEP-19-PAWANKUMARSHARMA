<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
 
<fieldset>
<legend>Create Profile</legend>
<form action="./createprofile" method="post">
		Name: <input name="name" type="text"><br><br>
		Email: <input name="email" type="email"><br><br>
		Password: <input type="password" name="password"><br><br>
		
		
		Date Of Joining: <input type="date" name="doj"><br><br>
		Gender:<select name="gender"><option value="M">Male</option><option value="F">Female</option></select>
		<input type="submit" value ="register" name="submit"><br>
		<input type="reset" value ="reset" name="reset"><br>
	</form>
</fieldset>
<a href="./login">Login</a>
</body>
</html>