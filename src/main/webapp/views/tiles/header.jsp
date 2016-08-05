<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</script>
</head>
<body>
	<div class="all">
		<div class="navbar navbar-inverse navbar-static-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#responsive-menu">
						<span class="sr-only">Open navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="home">Sombra Shop</a>
				</div>
				<div class="collapse navbar-collapse" id="responsive-menu">
					<ul class="nav navbar-nav">
						<sec:authorize access="hasRole('ROLE_ADMIN')">
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false" type="button">Create User<b
									class="caret"></b></a>
								<ul class="dropdown-menu">
									<li><a href="user=1">Users</a></li>
									<li class="divider"></li>
									<li><a href="adminPage">Admin Page </a></li>
								</ul></li>
						</sec:authorize>
						<li><a href="productPage=1">Products</a></li>

						<sec:authorize access="isAuthenticated()">
							<li class="btn btn-default btn-lg" id="glyphiconBasket"><a href="userBasket"><span
								class="glyphicon glyphicon-shopping-cart"></span></a></li>
						</sec:authorize>

						<form:form action="productPage=1" method="GET"
							class="navbar-form navbar-left" id="searchBlock" role="search">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Search"
									name="searchName">
							</div>
							<button type="submit" class="btn btn-default">Search</button>
						</form:form>


						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"
							type="button">Music<b class="caret"></b></a>
							<ul class="dropdown-menu" id="playMusicButton">
								<li><audio
										src='<c:url value="/resources/music/1.mp3"></c:url>' controls>
									<p>Fallback content goes here.</p>
									</audio></li>
							</ul></li>

						<li id="afc"><sec:authorize access="isAuthenticated()"> Hello, <sec:authentication
									property="name" />
								<a href="logout" id="logout">Logout</a>
							</sec:authorize> <sec:authorize access="isAnonymous()">
								<a href="loginpage" id="login">Login</a>
							</sec:authorize></li>
					</ul>



				</div>
			</div>
		</div>
	</div>


</body>
</html>