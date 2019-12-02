<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<body bgcolor="red">
<h4><%=msg %></h4>
					<a href="./home">Home</a>
					<a href="./logout">Logout</a>
				
	<fieldset align="center">
		<legend>Change Password</legend>
		<form action="./updatepassword" method="post">
			<table>
				<tr>
					<td>New Password:</td>
					<td><input name="password" type="password"></td>
				</tr>
				<tr>
					<td>confirm Password:</td>
					<td><input name="confirmpassword" type="password"></td>
				</tr>
				<tr>
					<td><input type="reset" value="reset"></td>
					<td><input type="submit" value="change password"></td>
				</tr>
				




			</table>


		</form>
	</fieldset>
</body>
</html>