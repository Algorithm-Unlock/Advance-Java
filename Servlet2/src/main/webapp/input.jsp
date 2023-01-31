<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<meta charset="ISO-8859-1">
<body>
<form action = Login1Servlet method = post>
<h1>USER LOGIN</h1>
<table>
<tr><td>Enter User Name:</td><td><Input type = "text" name='txtName'></td></tr>
<tr><td>Enter password:</td><td> <Input type = "password" name='txtPwd'></td></tr>
<tr><td><input type = submit value = Login> </td><td><input type = reset></td></tr>
</table>
</form>
</body>
</html>