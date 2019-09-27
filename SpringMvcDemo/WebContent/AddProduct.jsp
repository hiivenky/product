<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@taglib prefix="fo" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Add Product
<table>
<fo:form action="pagesubmit" method="post" modelAttribute="myForm">
<tr>
<td>Product Id</td>
<td><fo:input path="prodId"/></td>
<td><span><fo:errors path="prodId"></fo:errors></span></td>
</tr>
<tr>
<td>Product Name</td>
<td><fo:input path="prodName"/></td>
<td><span><fo:errors path="prodName"></fo:errors></span></td>
</tr>
<tr>
<td>Product Price</td>
<td><fo:input path="prodPrice"/></td>
</tr>
<tr>
<td>Product Type</td>
<td><fo:select path="typr" items="${dataitem}"/></td>
</tr>
<tr>
<td><fo:input type="submit" value="Submit" path=""/></td>
</tr>
</fo:form>
</table>
</body>
</html>