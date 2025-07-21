<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
    body{
        height: 100vh;
        width: 100vw;
        position: relative;
        display: flex;
        justify-content: center;
        align-items: center;
        align-content: center;
        background-color: aqua;
    }
    
    div{
        background-color: gold;
        height: 30%;
        width: 30%;
        position: absolute;
    }
    table{
        margin: auto;
    }
</style>
<body>
      <div>
          <table>
               <thead>
                     <center><h2>Student Registration successfully</h2></center>
               </thead>
               <tbody>
                     <tr>
                         <th>Student name:</th>
                         <th>${student.stuName}</th>
                     </tr>
                      <tr>
                         <th>Student Email:</th>
                         <th>${student.stuEmail}</th>
                     </tr>
                      <tr>
                         <th>Student Age:</th>
                         <th>${student.stuAge}</th>
                     </tr>
                      <tr>
                         <th>Student Gender</th>
                         <th>${student.stuGender}</th>
                     </tr>
               </tbody>
          </table>
      </div>
</body>
</html>