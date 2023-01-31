<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying Current Date and Time</title>
</head>
<body >
<centre>
            <fieldset>
                
                <h3>Current Date and Time iss :</h3>
                <% java.util.Date d = new java.util.Date();
                out.println(d.toString()); %>
            </fieldset>
            </centre>

</body>
</html>