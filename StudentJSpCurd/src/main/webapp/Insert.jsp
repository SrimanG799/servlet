<%@page import="com.util.UtilConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="com.model.Student,com.servlice.ServiceImpli"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
int roll=Integer.parseInt(request.getParameter("roll"));
String name=request.getParameter("name");
String course=request.getParameter("course");
String location=request.getParameter("location");
Student student=new Student(roll,name,course,location);
ServiceImpli srImpli=new ServiceImpli();
srImpli.insert(student);

%>

</body>
</html>