<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Employee Id and Password</h1>
    <form action="empLogin" method="post">
        <label>Id :</label><br>
        <input type="number" name="empId"><br>
        <label>Password :</label><br>
        <input type="text" name="emppassword"><br>
        <button type="submit">Login</button>
    </form>
</body>

</html>