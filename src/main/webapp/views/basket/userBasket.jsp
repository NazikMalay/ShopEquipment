<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div>
				<!--class="col-xs-8"-->
				<div class="panel panel-info">
					<div class="panel-heading">
						<div class="panel-title">
							<div class="row">
								<div class="col-xs-6">
									<h5>
										<span class="glyphicon glyphicon-shopping-cart"></span>
										Shopping Cart
									</h5>
								</div>
								<div class="col-xs-6">
									<button  type="submit" class="btn btn-primary btn-sm btn-block">
										<span class="glyphicon glyphicon-share-alt"></span><a class="myBTN" href="productPage=1">Continue
										shopping</a> 
									</button>
								</div>
							</div>
						</div>
					</div>
					<div class="panel-body">
						<c:forEach var="allProductinBasketOneUserList"
							items="${allProductinBasketOneUserList}">
							
							<div class="row">
								<div class="col-xs-2">
									<img class="userBasketImage"
										src="data:image/jpeg;base64,${allProductinBasketOneUserList.product.image}"
										alt="sorry">
								</div>
								<div class="col-xs-4">
									<h4 class="product-name">
										<strong>${allProductinBasketOneUserList.product.firmName}</strong>
									</h4>
									<h4>
										<small>${allProductinBasketOneUserList.product.model}</small>
									</h4>
								</div>
								<div class="col-xs-6">
									<div class="col-xs-6 text-right">
										<h6>
											<strong id="tab">${allProductinBasketOneUserList.product.price} 
												<span class="text-muted">$</span>
											</strong>
										</h6>
									</div>
									<div class="col-xs-4">
										<input type="text" class="form-control input-sm" value="1">
									</div>
									<div class="col-xs-2">
										<form:form action="dellProductFromBasket=${allProductinBasketOneUserList.idProductInBusket}" method="GET">
											<button type="submit"  class="btn btn-link btn-xs">
												<span class="glyphicon glyphicon-trash">
												</span>
											</button>
										</form:form>
									</div>
								</div>
							</div>
							<hr>
						</c:forEach>

						<div class="row">
							<div class="text-center">
								<div class="col-xs-9">
									<h6 class="text-right">Added items?</h6>
								</div>
								<div class="col-xs-3">
									<button type="button" class="btn btn-default btn-sm btn-block"><a href="userBasket">
										Update cart</a></button>
								</div>
							</div>
						</div>
					</div>
					<div class="panel-footer">
						<div class="row text-center">
							<div class="col-xs-3">
								<button type="button" class="btn btn-success btn-block">
									Checkout</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>