<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<center>
<c:if test="${not empty msg}">
<h2>User Record Inserted sucessfully</h2>
</c:if>
<c:if test="${not empty msg1}">
<h2>User Record Updated Sucessfully</h2>
</c:if>
<c:if test="${not empty msg2}">
<h2>User Record Deleted Sucessfully</h2>
</c:if>



<h1>RestTemplate Example with User</h1>
<a href="adduser">Add User</a><br><br>
<a href="showusers">Show All User</a><br><br>
<a href="showbyid">Show User By Id</a><br><br>
<a href="update">Update User</a><br><br>
<a href="delete">Delete User</a>
</center>
