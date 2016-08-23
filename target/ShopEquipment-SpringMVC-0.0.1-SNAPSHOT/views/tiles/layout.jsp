<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->


    <!-- Bootstrap -->
    <link rel="stylesheet" href="resources/bootstrap3/css/bootstrap.min.css">

		<link rel="stylesheet"
			href=<c:url value="resources/css/style.css"></c:url>>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<title><tiles:getAsString name="title"></tiles:getAsString></title>
</head>
<body>

	<div>
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
	</div>
	<div>
		<tiles:insertAttribute name="body"></tiles:insertAttribute>
	</div>
	<div>
		<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	</div>
	
	 
	 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	
    <script src="resources/bootstrap3/js/jquery.min.js"></script> 
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="resources/bootstrap3/js/bootstrap.min.js"></script>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"
	type="text/javascript"></script>
	
</body>
</html>