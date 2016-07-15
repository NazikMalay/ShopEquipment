<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href=<c:url value="resources/css/signIn.css"></c:url>>
<title>Insert title here</title>
	<script type="text/javascript">
 		function () {

			$('#login-form-link').click(function(e) {
				$("#login-form").delay(100).fadeIn(100);
				$("#register-form").fadeOut(100);
				$('#register-form-link').removeClass('active');
				$(this).addClass('active');
				e.preventDefault();
			});
			$('#register-form-link').click(function(e) {
				$("#register-form").delay(100).fadeIn(100);
				$("#login-form").fadeOut(100);
				$('#login-form-link').removeClass('active');
				$(this).addClass('active');
				e.preventDefault();
			});

		};
	</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="login-form-link">Login</a>
							</div>
							<div class="col-xs-6">
								<a href="addNewUserPage" id="register-form-link">Register</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="login-form" action="loginprocessing" method="post"
									role="form" style="display: block;">
									<div class="form-group">
										<label for="exampleInputEmail1">Login</label><input
											type="text" name="username" tabindex="1"
											class="form-control" placeholder="User nick name" >
									</div>
									<div class="form-group">
										<label for="exampleInputPassword1">Password</label><input
											type="password" name="password" id="exampleInputPassword1"
											tabindex="2" class="form-control" placeholder="Password">
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit"
													tabindex="4" class="form-control btn btn-login"
													value="Login">
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

















	<!-- 	<div class="login" class="container"> -->
	<!-- 	<form action="loginprocessing" method="post"> -->
	<!-- 		<div class="form-group"> -->
	<!-- 			<label for="exampleInputEmail1">Login</label> <input -->
	<!-- 				type="text" class="form-control" name="username"> -->
	<!-- 		</div> -->
	<!-- 		<div class="form-group"> -->
	<!-- 			<label for="exampleInputPassword1">Password</label> <input -->
	<!-- 				type="password" name="password" class="form-control" id="exampleInputPassword1" -->
	<!-- 				placeholder="Password"><input type="submit" class="btn btn-default" value="Login"> -->
	<!-- 		</div> -->


	<!-- 	</form> -->

	<!-- </div> -->




	<!-- 

	<form action="loginprocessing" method="post">
		Login <input type="text" name="username"> Password <input
			type="password" name="password"> <input type="submit"
			value="Login">
	</form> -->
</body>
</html>