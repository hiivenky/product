<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Prooduct Price</th>
</tr>
<a:forEach var="pro" items="${data}">
<tr>
<td>${pro.prodId}</td>
<td>${pro.prodName}</td>
<td>${pro.prodPrice}</td>
</tr>
</a:forEach>
</table>
<a href="home">Return Home</a>
</body>
</html>