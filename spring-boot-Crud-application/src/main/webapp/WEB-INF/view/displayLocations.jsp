<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Id</th>
			<th>Code</th>
			<th>Name</th>
			<th>Type</th>
		</tr>
		<c:forEach items="${msg}" var="location">
		<tr>
			<td>${location.id}</td>
			<td>${location.code}</td>
			<td>${location.name}</td>
			<td>${location.type}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>