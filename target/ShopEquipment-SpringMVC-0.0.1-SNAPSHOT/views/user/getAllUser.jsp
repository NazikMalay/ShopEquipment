<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


</head>
<body>
<c:url var="firstUrl" value="/user=1" />
<c:url var="lastUrl" value="/user=${users.totalPages}" />
<c:url var="prevUrl" value="/user=${currentIndex - 1}" />
<c:url var="nextUrl" value="/user=${currentIndex + 1}" />

<h3>User:</h3>
	<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>Surname</th>
				<th>Nickname</th>
				<th>Email</th>
				<th>Phone</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${user}">
				<tr>
					<td>${user.name}</td>
					<td>${user.surname}</td>
					<td>${user.nickName}</td>
					<td>${user.email}</td>
					<td>${user.numberPhone}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<div>
    <ul class="pagination">
        <c:choose>
            <c:when test="${currentIndex == 1}">
                <li class="disabled"><a href="#"><span aria-hidden="true">&laquo;</span></a></li>
                <li class="disabled"><a href="#"><span aria-hidden="true">&laquo;</span></a></li>
            </c:when>
            <c:otherwise>
                <li><a aria-label="Previous" href="${firstUrl}"><span aria-hidden="true">&laquo;</span></a></li>
                <li><a aria-label="Previous" href="${prevUrl}"><span aria-hidden="true">&laquo;</span></a></li>
            </c:otherwise>
        </c:choose>
        <c:forEach var="i" begin="${beginIndex}" end="${endIndex}">
            <c:url var="pageUrl" value="/user=${i}" />
            <c:choose>
                <c:when test="${i == currentIndex}">
                    <li class="active"><a href="${pageUrl}"><c:out value="${i}" /><span class="sr-only">(current)</span></a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="${pageUrl}"><c:out value="${i}" /></a></li>
                </c:otherwise>
            </c:choose>
        </c:forEach>
        <c:choose>
            <c:when test="${currentIndex == users.totalPages}">
                <li class="disabled"><a aria-label="Next" href="#"><span aria-hidden="true">&raquo;</span>
                </a></li>
                <li class="disabled"><a aria-label="Next" href="#"><span aria-hidden="true">&raquo;</span>
                </a></li>
            </c:when>
            <c:otherwise>
                <li><a href="${nextUrl}"><span aria-hidden="true">&raquo;</span></a></li>
                <li><a href="${lastUrl}"><span aria-hidden="true">&raquo;</span></a></li>
            </c:otherwise>
        </c:choose>
    </ul>
  
</div>

	
	<a href="createNewUser">Create User</a>
</body>
</html>