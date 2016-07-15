<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body class="nav-md">
	<div class="row">
		<div class="col-md-12 col-sm-12 col-xs-12">
			<div class="x_panel">
				<div class="x_title">
					<ul class="nav navbar-right panel_toolbox">
						<li><a href="#"><i class="fa fa-chevron-up"></i></a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-expanded="false"><i
								class="fa fa-wrench"></i></a>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#">Settings 1</a></li>
								<li><a href="#">Settings 2</a></li>
							</ul></li>
						<li><a href="#"><i class="fa fa-close"></i></a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<div class="x_content">

					<div class="col-md-7 col-sm-7 col-xs-12">
						<div class="product-image">
							<img class="col-md-12 col-sm-12 col-xs-12"
								src="data:image/jpeg;base64,${productObject.image}" alt="..." />
						</div>
						<div class="product_gallery">
							<a> <img src="" alt="..." />
							</a> <a> <img src="" alt="..." />
							</a> <a> <img src="" alt="..." />
							</a> <a> <img src="" alt="..." />
							</a>
						</div>
					</div>

					<div class="col-md-5 col-sm-5 col-xs-12"
						style="border: 0px solid #e5e5e5;">

						<ul class="list-group">
							<li class="list-group-item">Firm: ${productObject.firm}</li>
							<li class="list-group-item">Model: ${productObject.model}</li>
							<li class="list-group-item">Weight: ${productObject.weight}</li>
							<li class="list-group-item">Size: ${productObject.size}</li>
							<li class="list-group-item">Type: ${productObject.type}</li>
							<li class="list-group-item"><span class="badge">${productObject.amountAvailable}</span>In
								stock:</li>
						</ul>





						<p>Raw denim you probably haven't heard of them jean shorts
							Austin. Nesciunt tofu stumptown aliqua butcher retro keffiyeh
							dreamcatcher synth. Cosby sweater eu banh mi, qui irure terr.</p>
						<br /> <br />

						<div class="">
							<h2>
								Size <small>Please select one</small>
							</h2>
							<ul class="list-inline prod_size">
								<li>
									<button type="button" class="btn btn-default btn-xs">Small</button>
								</li>
								<li>
									<button type="button" class="btn btn-default btn-xs">Medium</button>
								</li>
								<li>
									<button type="button" class="btn btn-default btn-xs">Large</button>
								</li>
								<li>
									<button type="button" class="btn btn-default btn-xs">Xtra-Large</button>
								</li>
							</ul>
						</div>
						<br />

						<div class="">
							<div class="product_price">
								<h1 class="price">Ksh80.00</h1>
								<span class="price-tax">Ex Tax: Ksh80.00</span> <br>
							</div>
						</div>

						<div class="">
							<button type="button" class="btn btn-default btn-lg">Add
								to Cart</button>
							<button type="button" class="btn btn-default btn-lg">Add
								to Wishlist</button>
						</div>

						<div class="product_social">
							<ul class="list-inline">
								<li><a href="#"><i class="fa fa-facebook-square"></i></a></li>
								<li><a href="#"><i class="fa fa-twitter-square"></i></a></li>
								<li><a href="#"><i class="fa fa-envelope-square"></i></a></li>
								<li><a href="#"><i class="fa fa-rss-square"></i></a></li>
							</ul>
						</div>

					</div>


					<div class="col-md-12">

						<div class="" role="tabpanel" data-example-id="togglable-tabs">
							<ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
								<li role="presentation" class="active"><a
									href="#tab_content1" id="home-tab" role="tab" data-toggle="tab"
									aria-expanded="true">Home</a></li>
								<li role="presentation" class=""><a href="#tab_content2"
									role="tab" id="profile-tab" data-toggle="tab"
									aria-expanded="false">Profile</a></li>
								<li role="presentation" class=""><a href="#tab_content3"
									role="tab" id="profile-tab2" data-toggle="tab"
									aria-expanded="false">Profile</a></li>
							</ul>
							<div id="myTabContent" class="tab-content">
								<div role="tabpanel" class="tab-pane fade active in"
									id="tab_content1" aria-labelledby="home-tab">
									<p>Raw denim you probably haven't heard of them jean shorts
										Austin. Nesciunt tofu stumptown aliqua, retro synth master
										cleanse. Mustache cliche tempor, williamsburg carles vegan
										helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher
										synth. Cosby sweater eu banh mi, qui irure terr.</p>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="tab_content2"
									aria-labelledby="profile-tab">
									<p>Food truck fixie locavore, accusamus mcsweeney's marfa
										nulla single-origin coffee squid. Exercitation +1 labore
										velit, blog sartorial PBR leggings next level wes anderson
										artisan four loko farm-to-table craft beer twee. Qui photo
										booth letterpress, commodo enim craft beer mlkshk aliquip</p>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="tab_content3"
									aria-labelledby="profile-tab">
									<p>xxFood truck fixie locavore, accusamus mcsweeney's marfa
										nulla single-origin coffee squid. Exercitation +1 labore
										velit, blog sartorial PBR leggings next level wes anderson
										artisan four loko farm-to-table craft beer twee. Qui photo
										booth letterpress, commodo enim craft beer mlkshk</p>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>



	<div id="custom_notifications" class="custom-notifications dsp_none">
		<ul class="list-unstyled notifications clearfix"
			data-tabbed_notifications="notif-group">
		</ul>
		<div class="clearfix"></div>
		<div id="notif-group" class="tabbed_notifications"></div>
	</div>



















	<!-- <div class="container-fluid"> -->
	<!--     <div class="content-wrapper">	 -->
	<!-- 		<div class="item-container">	 -->
	<!-- 			<div class="container">	 -->
	<!-- 				<div class="col-md-12"> -->
	<!-- 					<div class="product col-md-3 service-image-left"> -->

	<%-- 						<center> --%>
	<%-- 							<img class="item-display" src="data:image/jpeg;base64,${productObject.image}" alt=""></img> --%>
	<%-- 						</center> --%>
	<!-- 					</div> -->

	<!-- 					<div class="container service1-items col-sm-2 col-md-2 pull-left"> -->
	<%-- 						<center> --%>
	<!-- 							<a id="item-1" class="service1-item"> -->
	<!-- 								<img src="#" alt=""></img> -->
	<!-- 							</a> -->
	<!-- 							<a id="item-2" class="service1-item"> -->
	<!-- 								<img src="#" alt=""></img> -->
	<!-- 							</a> -->
	<!-- 							<a id="item-3" class="service1-item"> -->
	<!-- 								<img src=# alt=""></img> -->
	<!-- 							</a> -->
	<%-- 						</center> --%>
	<!-- 					</div> -->
	<!-- 				</div> -->

	<!-- 				<div class="col-md-7"> -->
	<!-- 					<div class="product-title">Corsair GS600 600 Watt PSU</div> -->
	<!-- 					<div class="product-desc">The Corsair Gaming Series GS600 is the ideal price/performance choice for mid-spec gaming PC</div> -->
	<!-- 					<div class="product-rating"><i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star-o"></i> </div> -->
	<!-- 					<hr> -->
	<!-- 					<div class="product-price">$ 1234.00</div> -->
	<!-- 					<div class="product-stock">In Stock</div> -->
	<!-- 					<hr> -->
	<!-- 					<div class="btn-group cart"> -->
	<!-- 						<button type="button" class="btn btn-success"> -->
	<!-- 							Add to cart  -->
	<!-- 						</button> -->
	<!-- 					</div> -->
	<!-- 					<div class="btn-group wishlist"> -->
	<!-- 						<button type="button" class="btn btn-danger"> -->
	<!-- 							Add to wishlist  -->
	<!-- 						</button> -->
	<!-- 					</div> -->
	<!-- 				</div> -->
	<!-- 			</div>  -->
	<!-- 		</div> -->
	<!-- 		<div class="container-fluid">		 -->
	<!-- 			<div class="col-md-12 product-info"> -->
	<!-- 					<ul id="myTab" class="nav nav-tabs nav_tabs"> -->

	<!-- 						<li class="active"><a href="#service-one" data-toggle="tab">DESCRIPTION</a></li> -->
	<!-- 						<li><a href="#service-two" data-toggle="tab">PRODUCT INFO</a></li> -->
	<!-- 						<li><a href="#service-three" data-toggle="tab">REVIEWS</a></li> -->

	<!-- 					</ul> -->
	<!-- 				<div id="myTabContent" class="tab-content"> -->
	<!-- 						<div class="tab-pane fade in active" id="service-one"> -->

	<!-- 							<section class="container product-info"> -->
	<!-- 								The Corsair Gaming Series GS600 power supply is the ideal price-performance solution for building or upgrading a Gaming PC. A single +12V rail provides up to 48A of reliable, continuous power for multi-core gaming PCs with multiple graphics cards. The ultra-quiet, dual ball-bearing fan automatically adjusts its speed according to temperature, so it will never intrude on your music and games. Blue LEDs bathe the transparent fan blades in a cool glow. Not feeling blue? You can turn off the lighting with the press of a button. -->

	<!-- 								<h3>Corsair Gaming Series GS600 Features:</h3> -->
	<!-- 								<li>It supports the latest ATX12V v2.3 standard and is backward compatible with ATX12V 2.2 and ATX12V 2.01 systems</li> -->
	<!-- 								<li>An ultra-quiet 140mm double ball-bearing fan delivers great airflow at an very low noise level by varying fan speed in response to temperature</li> -->
	<!-- 								<li>80Plus certified to deliver 80% efficiency or higher at normal load conditions (20% to 100% load)</li> -->
	<!-- 								<li>0.99 Active Power Factor Correction provides clean and reliable power</li> -->
	<!-- 								<li>Universal AC input from 90~264V — no more hassle of flipping that tiny red switch to select the voltage input!</li> -->
	<!-- 								<li>Extra long fully-sleeved cables support full tower chassis</li> -->
	<!-- 								<li>A three year warranty and lifetime access to Corsair’s legendary technical support and customer service</li> -->
	<!-- 								<li>Over Current/Voltage/Power Protection, Under Voltage Protection and Short Circuit Protection provide complete component safety</li> -->
	<!-- 								<li>Dimensions: 150mm(W) x 86mm(H) x 160mm(L)</li> -->
	<!-- 								<li>MTBF: 100,000 hours</li> -->
	<!-- 								<li>Safety Approvals: UL, CUL, CE, CB, FCC Class B, TÜV, CCC, C-tick</li> -->
	<!-- 							</section> -->

	<!-- 						</div> -->
	<!-- 					<div class="tab-pane fade" id="service-two"> -->

	<!-- 						<section class="container"> -->

	<!-- 						</section> -->

	<!-- 					</div> -->
	<!-- 					<div class="tab-pane fade" id="service-three"> -->

	<!-- 					</div> -->
	<!-- 				</div> -->
	<!-- 				<hr> -->
	<!-- 			</div> -->
	<!-- 		</div> -->
	<!-- 	</div> -->
	<!-- </div> -->
</body>
</html>