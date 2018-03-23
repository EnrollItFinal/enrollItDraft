<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>School Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>School List</h1>
		
		<table border="1">

			<th>School Id</th>
			<th>Facilities Id</th>
			<th>Address Id</th>
			<th>Status</th>
		

			<c:forEach var="school" items="${listSchool}">
				<tr>

					<td>${school.schoolId}</td>
					<td>${school.facilities}</td>
					<td>${school.address}</td>
					<td>${school.status}</td>
					<td><a href="editSchool?id=${school.schoolId}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteSchool?id=${school.schoolId}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New School Register here <a href="newSchool">here</a>
		</h4>
	</div>
</body>
</html>