<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway|BookFlight</title>
</head>
<body >
<div align="center">
<h2>FlyAway Booking Portal</h2><hr></div>
<a href=HomePage.jsp style="color:black;text-decoration:none;font-size:20px;"> <-- Back to Home Page 	</a>

<%
@SuppressWarnings("unchecked")
HashMap<String,String> 
user=(HashMap<String,String>)session.getAttribute("user");
if(user==null){
response.sendRedirect("UserPage.jsp");
}
%>
<p align="center" style="color:green;font-size:30px;font-weight:bold">Flight 
Booked Successfully</p>
<p align="center" style="color:black;font-size:30px">Thank you</p>
</body>
</html>