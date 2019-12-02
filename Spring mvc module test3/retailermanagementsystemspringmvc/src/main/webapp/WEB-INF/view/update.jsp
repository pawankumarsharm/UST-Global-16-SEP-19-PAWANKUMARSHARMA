<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
 <a href="./home">Home</a>
 <a href="./logout">Logout</a>
<fieldset>
<legend>Update Profile</legend>
<form action="./update" method="post">
		Name: <input name="name" type="text"><br><br>
		Order id: <input type="date" name="doj"><br><br>
		price:<select name="price"><option value="M">Male</option><option value="F">Female</option></select>
		<input type="submit" value ="change" ><br>
		<input type="reset" value ="reset" ><br>
	</form>
</fieldset>

</body>
</html>