<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit School</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit School</h1>
        <form:form action="saveSchool" method="post" modelAttribute="school">
        <table>
            <form:hidden path="schoolId"/>
            <tr>
                <td>Facilities Id:</td>
                <td><form:input path="facilities" /></td>
            </tr>
            <tr>
                <td>Address Id:</td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td>Status:</td>
                <td><form:input path="status" /></td>
            </tr>
           
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>