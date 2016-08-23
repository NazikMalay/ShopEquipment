<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function addProductToCart(t) {
		$.ajax({
			url : 'addProductToCart',
			type : 'post',
			data : ({
				idProduct : t
			}),
			
		});
	}
</script>
</head>
<body>
	<!--  //$("#idProduct").val() -->
	<div class="container">
		<div class="row">
			<c:forEach var="productList" items="${productList}">
				<div class="col-sm-6 col-md-4" id="imgProduct">
						<div class="thumbnail" id="allProductForm">
						<a href="productSingle=${productList.productId}"> <img
							src="data:image/jpeg;base64,${productList.image}" alt="Oyyyps">
						</a>
						<div class="caption">
								<h3>${productList.firmName}</h3>
								<p>${productList.model}</p>
								<p>Price ${productList.price} $</p>
								<p>
									<button id="idProduct" onclick="addProductToCart(this.value)"
										class="btn btn-primary" role="button"
										value="${productList.productId}">Add to cart</button>
									<a href="productSingle=${productList.productId}"
										class="btn btn-default" role="button">More</a>
								</p>
							</div>
						</div>
				</div>

			</c:forEach>
		</div>

		<c:url var="firstUrl" value="/productPage=1?searchName=${searchName}" />
		<c:url var="lastUrl"
			value="/productPage=${products.totalPages}?searchName=${searchName}" />
		<c:url var="prevUrl"
			value="/productPage=${currentIndex - 1}?searchName=${searchName}" />
		<c:url var="nextUrl"
			value="/productPage=${currentIndex + 1}?searchName=${searchName}" />


		<div>
			<ul class="pagination">
				<c:choose>
					<c:when test="${currentIndex == 1}">
						<li class="disabled"><a href="#"><span aria-hidden="true">&laquo;</span></a></li>
						<li class="disabled"><a href="#"><span aria-hidden="true">&laquo;</span></a></li>
					</c:when>
					<c:otherwise>
						<li><a aria-label="Previous" href="${firstUrl}"><span
								aria-hidden="true">&laquo;</span></a></li>
						<li><a aria-label="Previous" href="${prevUrl}"><span
								aria-hidden="true">&laquo;</span></a></li>
					</c:otherwise>
				</c:choose>
				<c:forEach var="i" begin="${beginIndex}" end="${endIndex}">
					<c:url var="pageUrl"
						value="/productPage=${i}?searchName=${searchName}" />
					<c:choose>
						<c:when test="${i == currentIndex}">
							<li class="active"><a href="${pageUrl}"><c:out
										value="${i}" /><span class="sr-only">(current)</span></a></li>
						</c:when>
						<c:otherwise>
							<li><a href="${pageUrl}"><c:out value="${i}" /></a></li>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				<c:choose>
					<c:when test="${currentIndex == products.totalPages}">
						<li class="disabled"><a aria-label="Next" href="#"><span
								aria-hidden="true">&raquo;</span> </a></li>
						<li class="disabled"><a aria-label="Next" href="#"><span
								aria-hidden="true">&raquo;</span> </a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${nextUrl}"><span aria-hidden="true">&raquo;</span></a></li>
						<li><a href="${lastUrl}"><span aria-hidden="true">&raquo;</span></a></li>
					</c:otherwise>
				</c:choose>
			</ul>

		</div>
	</div>
</body>
</html>