<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form:form  action="verify"  method="post"  commandName="logm">
      Username : <form:input  path="username"/> <form:errors path="username"/> <br>
      Password : <form:password  path="password"/> <form:errors  path="password"/> <br>
      <input  type=submit   value="submit"> 
  </form:form>
</body>
</html>








