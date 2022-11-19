<%@page import="com.util.UtilConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
int roll=Integer.parseInt(request.getParameter("roll"));
Connection connection=null;
PreparedStatement pst=null;
try{
	connection=UtilConnect.getConnection();
	pst=connection.prepareStatement("delete from student where roll=?");
	pst.setInt(1,roll);
	pst.executeUpdate();
}
catch(Exception e)
{
e.printStackTrace();
}


%>

<%
request.getRequestDispatcher("GetDetails.jsp").forward(request, response);
%>

</body>
</html>