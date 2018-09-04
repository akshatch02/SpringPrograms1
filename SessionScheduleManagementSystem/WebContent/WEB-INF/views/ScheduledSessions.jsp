<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">Scheduled Sessions</h3>
	<hr>
	<table align="center">
		<tr>
			<th>Session Name</th>
			<th>Duration(Days)</th>
			<th>Faculty</th>
			<th>Mode</th>
		</tr>
		
		<c:forEach items="${session}" var="element">
			<tr>
				<td>${element.name}</td>
				<td>${element.duration}</td>
				<td>${element.faculty}</td>
				<td>${element.mode1}</td>
				<td><a href="enrollMe?name=${element.name}"> enrollMe</a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
	<hr>
	<br>
</body>
</html>