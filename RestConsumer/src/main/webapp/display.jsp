 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<center>
<table border=1>
<tr>
<th>UserId</th>
<th>UserName</th>
<th>Email</th>
</tr>
<c:if test="${not empty data}">
<c:forEach items="${data}" var="obj">
<tr>
<td>${obj.userId}</td>
<td>${obj.userName}</td>
<td>${obj.email}</td>
</tr>
</c:forEach>

</c:if>
</table>
<a href="index.jsp">GO TO HOME PAGE</a>
</center>

