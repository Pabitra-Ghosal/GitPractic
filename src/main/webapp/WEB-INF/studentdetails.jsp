<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br>
	<center>
		<table border="1">
			<tr>
				<td>Student Id</td>
				<td>${student.sid}</td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td>${student.sname}</td>
			</tr>
			<tr>
				<td>Student Email Id</td>
				<td>${student.semail}</td>
			</tr>
			<tr>
				<td>Student Mobile No</td>
				<td>${student.smobile}</td>
			</tr>
		</table>
	</center>
</body>
</html>