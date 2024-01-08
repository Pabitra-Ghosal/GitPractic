<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<table width="100%"  height="735">
	<tr height="10%">
		<td colspan="2" bgcolor="maroon" align="center">
			<tiles:insertAttribute name="header"/>
		</td>
	</tr>
	<tr height="85%">
		<td width="20%" bgcolor="lightyellow" align="center">
			<tiles:insertAttribute name="menu"/>
		</td>
		<td width="80%" bgcolor="lightblue" align="center">
			<tiles:insertAttribute name="body"/>
		</td>
	</tr>
	<tr height="15%">
		<td colspan="2" bgcolor="blue" align="center">
			<tiles:insertAttribute name="footer"/>
		</td>
	</tr>
</table>
</body>
</html>