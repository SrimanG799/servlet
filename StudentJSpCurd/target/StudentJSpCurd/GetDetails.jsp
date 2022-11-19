<%@page import="com.model.Student"%>
<%@page import="com.servlice.ServiceImpli"%>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

ServiceImpli srvi=new ServiceImpli();
 List<Student> stu= srvi.getAll();
 out.print("<table border=2px>");
 out.print("<th>Student Details</th>");
 out.print("<tr>");
 out.print("<td><h6>roll</h6></td>");
 out.print("<td><h6>name</h6></td>");
 out.print("<td><h6>course</h6></td>");
 out.print("<td><h6>location</h6></td>");
 
 for(Student s:stu){
	
	 
	 out.print("<tr>");
	 out.print("<td>"+s.getRoll()+"</td>");
	 out.print("<td>"+s.getName()+"</td>");
	 out.print("<td>"+s.getCourse()+"</td>");
	 out.print("<td>"+s.getLocation()+"</td>");
	 out.print("</tr>");
	
 } out.print("</table>");

 
  

%>

</body>
</html>