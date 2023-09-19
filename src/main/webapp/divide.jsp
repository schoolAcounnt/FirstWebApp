<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter two numbers to divide</title>
</head>
<body>
<form action="getNumsServletDiv" method="post">
Enter the numbers to divide:
number to divide <input type="number" name="userNumOne" size="10"><br>
number to divide by<input type="number" name="userNumTwo" size="10">
<input type="submit" value="Calculate" />
</form>
</body>
</html>