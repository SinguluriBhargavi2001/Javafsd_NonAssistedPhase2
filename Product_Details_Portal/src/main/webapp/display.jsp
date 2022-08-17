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
String s=(String)session.getAttribute("Product_Id");
out.println("Product Id = "+s+"<br>");
%>
<%
String a=(String)session.getAttribute("Product_Name");
out.println("Product Name = "+a+"<br>");
%>
<%
String b=(String)session.getAttribute("Product_Price");
out.println("Product Price = "+b+"<br>");
%>
</body>
</html>