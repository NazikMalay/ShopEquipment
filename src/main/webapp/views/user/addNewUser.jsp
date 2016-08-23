<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="addUser">
		<form:form action="createUser" method="post"
			modelAttribute="userObject">
			<div class="form-group">
				<form:label path="name">Name</form:label>
				<form:input path="name" />
			</div>
			<div class="form-group">
				<form:label path="surname">Surname</form:label>
				<form:input path="surname" />
			</div>
			<div class="form-group">
				<form:label path="nickName">NickName</form:label>
				<form:input path="nickName" />
			</div>
			<div class="form-group">
				<form:label path="email">Email</form:label>
				<form:input path="email" />
			</div>
			<div class="form-group">
				<form:label path="password">Password</form:label>
				<form:input path="password" />
			</div>
			<div class="form-group">
				<form:label path="numberPhone">Number Phone</form:label>
				<form:input path="numberPhone" />
			</div>
			<div class="form-group">
				<input type="submit" value="Save User" />
			</div>
		</form:form>
	</div>
</body>
</html>