<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>
	<div align="center">
		<h1>Registration Page</h1>
		<form action=Register1 method=post>
			<table>
				<tr>
					<td>User Name:</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>User Email:</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>User Phone:</td>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" name="register"></td>
				</tr>

			</table>
		</form>
</body>
</html>