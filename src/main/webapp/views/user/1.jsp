<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>



<c:url var="firstUrl" value="/user/1" />
<c:url var="lastUrl" value="/user/${deploymentLog.totalPages}" />
<c:url var="prevUrl" value="/user/${currentIndex - 1}" />
<c:url var="nextUrl" value="/user/${currentIndex + 1}" />

<div class="pagination">
    <ul>
        <c:choose>
            <c:when test="${currentIndex == 1}">
                <li class="disabled"><a href="#">&lt;&lt;</a></li>
                <li class="disabled"><a href="#">&lt;</a></li>
            </c:when>
            <c:otherwise>
                <li><a href="${firstUrl}">&lt;&lt;</a></li>
                <li><a href="${prevUrl}">&lt;</a></li>
            </c:otherwise>
        </c:choose>
        <c:forEach var="i" begin="${beginIndex}" end="${endIndex}">
            <c:url var="pageUrl" value="/user/${i}" />
            <c:choose>
                <c:when test="${i == currentIndex}">
                    <li class="active"><a href="${pageUrl}"><c:out value="${i}" /></a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="${pageUrl}"><c:out value="${i}" /></a></li>
                </c:otherwise>
            </c:choose>
        </c:forEach>
        <c:choose>
            <c:when test="${currentIndex == users.totalPages}">
                <li class="disabled"><a href="#">&gt;</a></li>
                <li class="disabled"><a href="#">&gt;&gt;</a></li>
            </c:when>
            <c:otherwise>
                <li><a href="${nextUrl}">&gt;</a></li>
                <li><a href="${lastUrl}">&gt;&gt;</a></li>
            </c:otherwise>
        </c:choose>
    </ul>
    <a href="createNewUser">Create User</a>
</div>
<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>Surname</th>
				<th>Nickname</th>
				<th>Email</th>
				<th>Password</th>
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
					<td>${user.password}</td>
					<td>${user.numberPhone}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
