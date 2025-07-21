<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>Employee Leave Application Form</h1>
   <form action="saveLeave" method="post">
     <label>Id :</label>
     <input type="number" name="empId"><br>
     
     <label>Leave type :</label>
     <input type="text" name="empLeave"><br>
     
     <label>Start Date :</label>
     <input type="date" name="empStartDate"><br>
     
     <label>End Date :</label>
     <input type="date" name="empEndDate"><br>
     
     <label>Reason :</label>
     <input type="text" name="empReason"><br>
     
     <button type="submit">Submit</button>
   </form>
</body>

</html>