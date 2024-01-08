<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br>
<form:form action="edit" commandName="student" method="POST">
<center>
<table>
	<tr>
		<td>Student Id</td>
		<td><form:input path="sid"  readonly="true" />${student.sid}</td>
	</tr>
	<tr>
		<td>Student Name</td>
		<td><form:input path="sname"/>${student.sname}</td>
	</tr>
	<tr>
		<td>Student Email</td>
		<td><form:input path="semail"/>${student.semail}</td>
	</tr>
	<tr>
		<td>Student Mobile</td>
		<td><form:input path="smobile"/>${student.smobile}</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="UPDATE">
		</td>
		
	</tr>
</table>
</center>
</form:form>
</body>
</html>