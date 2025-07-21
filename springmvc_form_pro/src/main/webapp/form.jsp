<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
     <form action="save" method="post">
         <table>
              <thead>  
                <center><h1>Student Registration Form</h1></center>
                
              </thead>
              <tbody>
                    <tr>
                       <th><label for="stuName">Name :</label></th>
                        <td><input type="text" name="stuName" id="stuName"></td>
                    </tr>
                     <tr>
                       <th><label for="stuEmail">Email :</label></th>
                        <td><input type="text" name="stuEmail" id="stuEmail"></td>
                    </tr>
                     <tr>
                       <th><label for="stuAge">Age :</label></th>
                        <td><input type="text" name="stuAge" id="stuAge"></td>
                    </tr>
                     <tr>
                       <th><label for="stuGender">Gender :</label></th>
                        <td><input type="radio" value="Male" name="stuGender" id="gender">Male
                             <input type="radio" value="Female" name="stuGender" id="gender">Female
                        </td>
                    </tr>
                    <tr>
                        <th colspan=""2><button type="submit">Submit</button></th>
                    </tr>
              </tbody>
         </table>
     </form>
</div>
</body>
</html>