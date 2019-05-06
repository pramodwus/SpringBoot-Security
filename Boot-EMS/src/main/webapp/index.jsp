<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>Welcome to Employee Management</h2>
<c:if test="${not empty msg}">
<h2>Employeed Added sucessfully</h2>
</c:if>
<a href="employee">AddEmployee</a><br><br>
<a href="showemployee">ListOfEmployee</a>
</center>
</body>
</html>