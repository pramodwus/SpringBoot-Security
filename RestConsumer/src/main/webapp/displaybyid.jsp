<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Record of Emloyee By Id</h1>
<table border="1">
<tr><th>UserID</th>
<th>UserName</th>

<th>Email</th>
</tr>
<tr><td>${d.userId}</td>

<td>${d.userName}</td>
<td>${d.email}</td>
</tr>
</table>
<br>
<a href="index.jsp">GO TO HOME PAGE</a>
</center>
</body>
</html>