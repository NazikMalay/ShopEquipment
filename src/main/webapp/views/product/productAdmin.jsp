<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="panel-group" id="accordion" role="tablist"
		aria-multiselectable="true">
		<div class="panel panel-default">
			<div class="panel-heading" role="tab" id="headingOne">
				<h4 class="panel-title">
					<a role="button" data-toggle="collapse" data-parent="#accordion"
						href="#collapseOne" aria-expanded="true"
						aria-controls="collapseOne"> Firm/Product type Menu </a>
				</h4>
			</div>
			<div id="collapseOne" class="panel-collapse collapse in"
				role="tabpanel" aria-labelledby="headingOne">
				<div class="prodAdm">
					<div>
						<h2>Add Firm</h2>
						<form:form action="addNewFirm" method="post"
							modelAttribute="firmObject">
							<div class="form-group">
								<form:label path="firmName">Firm Name</form:label>
								<form:input path="firmName" />
							</div>
							<input class="btn btn-success" type="submit" value="Save Firm">

						</form:form>
					</div>
					<div class="">
						<h2>Dell Product</h2>
						<form:form action="dellFirm" method="post"
							modelAttribute="allFirms">
							<c:forEach var="firm" items="${allFirms}">
								<input type="radio" name="firm" value="${firm.idFirm}">${firm.firmName}
					</c:forEach>
							<input class="btn btn-success" type="submit" value="Dell Firm">
						</form:form>
					</div>

				</div>
				<hr>
				<div class="prodAdm">
					<div>
						<h2>Add Product Type</h2>
						<form:form action="addNewProductType" method="post"
							modelAttribute="productTypeObject">
							<div class="form-group">
								<form:label path="typeName">Firm Name</form:label>
								<form:input path="typeName" />
							</div>
							<input class="btn btn-success" type="submit"
								value="Save Type Firm">

						</form:form>

						<h2>Dell Product Type</h2>
						<form:form action="dellProductType" method="post"
							modelAttribute="allProductType">
							<c:forEach var="productType" items="${allProductType}">
								<input type="radio" name="productType"
									value="${productType.idTypeProduct}">${productType.typeName}
					</c:forEach>
							<input class="btn btn-success" type="submit"
								value="Dell product type">
						</form:form>
					</div>
				</div>

			</div>
		</div>


		<div class="panel panel-default">
			<div class="panel-heading" role="tab" id="headingTwo">
				<h4 class="panel-title">
					<a class="collapsed" role="button" data-toggle="collapse"
						data-parent="#accordion" href="#collapseTwo" aria-expanded="false"
						aria-controls="collapseTwo"> Image</a>
				</h4>
			</div>
			<div id="collapseTwo" class="panel-collapse collapse" role="tabpanel"
				aria-labelledby="headingTwo">
				<div class="container">
					123
					<form action="changeImage" method="post"
						enctype="multipart/form-data">

						<div class="panel panel-default">
							<!-- Default panel contents -->
							<div class="panel-heading">Products</div>
							<div class="panel-body">
								<p>...</p>
							</div>

							<!-- Table -->
							<table class="table">
								<thead>
									<tr>
										<th>Firm</th>
										<th>Model</th>
										<th>Type price</th>
										<th>id</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="productList" items="${productList}">
										<tr>
											<td>${productList.firmName}</td>
											<td>${productList.model}</td>
											<td>${productList.price}</td>
											<td><input type="radio" name="productId"
												value="${productList.productId}">${productList.productId}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							<div class="form-group">
								Image <input type="file" name="image">
							</div>
							<button class="btn btn-success" type="submit">Change
								Image</button>
					</form>

				</div>

			</div>





		</div>
		<div class="panel panel-default">
			<div class="panel-heading" role="tab" id="headingThree">
				<h4 class="panel-title">
					<a class="collapsed" role="button" data-toggle="collapse"
						data-parent="#accordion" href="#collapseThree"
						aria-expanded="false" aria-controls="collapseThree"> Add
						Product </a>
				</h4>
			</div>
			<div id="collapseThree" class="panel-collapse collapse"
				role="tabpanel" aria-labelledby="headingThree">
				<div class="container">
					<form action="createProduct" method="post"
						enctype="multipart/form-data">
						<div class="form-group">
							model<input type="text" name="model">
						</div>
						<div class="form-group">
							prise<input type="text" name="prise">
						</div>
						<div class="form-group">
							size<input type="text" name="size">
						</div>
						<div class="form-group">
							weight<input type="text" name="weight">
						</div>
						<div class="form-group">
							amounAvailable<input type="text" name="amounAvailable">
						</div>
						<div class="form-group">
							Image <input type="file" name="image">
						</div>
						<div class="form-group">
							Firm
							<c:forEach var="firm" items="${allFirms}">
								<input type="radio" name="firm" value="${firm.idFirm}">${firm.firmName}
							</c:forEach>
						</div>
						<div class="form-group">
							Product Type
							<c:forEach var="productType" items="${allProductType}">
								<input type="radio" name="productType"
									value="${productType.idTypeProduct}">${productType.typeName}
							</c:forEach>
						</div>
						<button class="btn btn-success" type="submit">Create
							Product</button>

					</form>

				</div>

			</div>
		</div>
	</div>




	<!-- 	<div class="addNewFirm">
		<form:form action="addNewFirm" method="post"
			modelAttribute="firmObject">
			<div class="form-group">
				<form:label path="firmName">Firm Name</form:label>
				<form:input path="firmName" />
			</div>
			<input class="btn btn-success" type="submit" value="Save Firm">

		</form:form>
	</div>
	<div>
	<h2>Dell Product</h2>
	<form:form action="dellFirm" method="post"
			modelAttribute="allFirms">
		<c:forEach var="firm" items="${allFirms}">
			<input type="radio" name="firm" value="${firm.idFirm}">${firm.firmName}
		</c:forEach>
		<input class="btn btn-success" type="submit" value="Dell Firm">
		</form:form>
	</div> -->
</body>
</html>