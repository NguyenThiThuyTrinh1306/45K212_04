<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Bean.Product"%>
<%@page import="Model.Bean.Detail"%>
<%@page import="java.util.List"%>
<%@page import="Model.Bean.Account"%>
<%@page import="java.util.LinkedHashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<meta charset="utf-8">
<title>Rent product</title>


<meta name="description" content="----">

<meta name="keywords" content="Premium HTML Template">

<meta name="author" content="HTMLmate">

<!-- Mobile Specific Meta -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- css-include -->

<!-- boorstrap -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<!-- themify-icon.css -->
<link rel="stylesheet" type="text/css" href="css/themify-icons.css">
<!-- owl-carousel -->
<link rel="stylesheet" type="text/css" href="css/owl.carousel.css">
<!-- light-box -->
<link rel="stylesheet" type="text/css" href="css/lightbox.css">
<!-- video css -->
<link rel="stylesheet" type="text/css" href="css/video.min.css">
<!-- menu.css -->
<link rel="stylesheet" type="text/css" href="css/menu.css">
<!-- style -->
<link rel="stylesheet" type="text/css" href="css/style.css">
<!-- responsive.css -->
<link rel="stylesheet" type="text/css" href="css/responsive.css">

<link rel="stylesheet" type="text/css" href="css/price_view.css" />

<style type="text/css">
#numProduct {
	position: absolute;
	background-color: red;
	color: white;
	width: 20px;
	height: 20px;
	font-weight: bold;
	text-align: center;
	border-radius: 50%;
	top: 0%;
	right: 0%;
	text-align: center;
}

/* #delete-product { */
/* 	color: white; */
/* 	background-color: #e74c3c; */
/* 	padding: 5px; */
/* 	border-radius: 10px; */
/* 	font-size: 1.2rem; */
/* } */

/* #delete-product:hover { */
/* 	opacity: 0.7; */
/* } */
</style>
</head>


<body>
	<%
	Account account = (Account) session.getAttribute("account");
	List<Detail> cart = (ArrayList<Detail>) session.getAttribute("cart");
	%>
	<div id="preloader"></div>
	<!-- Start of nav bar 
		============================================= -->
	<nav id="poppin-nav">
		<div id="nav-off"></div>
		<div id="header-logo-1" class="text-center">
			<a href="home"><img src="img/LOGO_CHATAM.png" alt="img"> <%
 if (account != null) {
 %> Admin <%=account.getDisplayName()%> <%
 } else {
 %> Customer <%
 }
 %> </a>
		</div>
		<ul id="menu">
			<li class="has-submenu text-capitalize"><a href="home">Home
					Page </a></li>
			<%
			if (account == null) {
			%>
			<li><a href="rent">Product rental</a></li>
			<li><a href="contact.jsp">Contact</a></li>
			<li><a href="login_form.jsp">Login</a></li>
			<%
			} else {
			%>
			<li><a href="admin.jsp">User</a></li>
			<li><a href="customers">Customer</a></li>
			<li><a href="invoices">Invoice</a></li>
			<li><a href="logout">Log out</a></li>
			<%
			}
			%>
		</ul>
	</nav>
	<div id="menu-overlay"></div>
	<!-- End of nav bar 
		============================================= -->



	<!-- Start of header
		============================================= -->
	<header id="site-header" class="not-stuck">
		<div class="container">
			<div class="row">
				<div id="header-logo">
					<a href="home"><img src="img/LOGO_CHATAM.png" alt="img"></a>
				</div>

				<div
					style="float: right; display: flex; justify-content: space-around;">
					<%
					if (account == null) {
					%>
					<div style="margin-right: 50px; position: relative;">
						<a href="cart.jsp"><img src="img/cart.png" width="50"
							height="50"></a>
						<p id="numProduct">
							<%
							if (cart == null || cart.size() == 0) {
							%>
							0
							<%
							} else {
							%>
							<%=cart.size()%>
							<%
							}
							%>
						</p>
					</div>
					<%
					}
					%>
					<div id="menu-burger" class="pull-right not-stuck">
						<div id="menu-bar">
							<span class="icon-bar top"></span> <span class="icon-bar middle"></span>
							<span class="icon-bar bottom"></span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<!-- Start of portfolio section
		============================================= -->
	<section id="portfolio" class="portfolio-section">
		<div class="container">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Product name</th>
						<th scope="col">Image</th>
						<th scope="col">Price</th>
						<th scope="col">Quantity</th>
						<th scope="col">Hire time</th>
						<th scope="col">Payment</th>
						<th scope="col" colspan="2"></th>
						<th scope="col">Status</th>
					</tr>
				</thead>
				<%
				if (cart != null) {
					float totalMonney = 0;
				%>
				<tbody>
					<%
					int index = 1;
					Product product = null;
					for (Detail detail : cart) {
						product = detail.getProduct();
						totalMonney += detail.getIntoMoney();
					%>
					<tr>
						<th scope="row"><%=index++%></th>
						<td><%=product.getName()%></td>
						<td><img src="<%=product.getImage()%>" width="100"
							height="100"></td>
						<td><%=product.getPrice()%></td>
						<td><%=detail.getQuantity()%></td>
						<td><%=detail.getTime()%></td>
						<td><%=detail.getIntoMoney()%></td>
						<td><a id="delete-product"
							href="cart?del=<%=product.getId()%>"><img
								src="img/remove.png" width="30" height="30"></a></td>
						<td><a id="delete-product"
							href="payment?id=<%=product.getId()%>"><img
								src="img/payment.png" width="30" height="30"></a></td>
						<td>
							<%
							if (detail.isStatus()) {
							%> <b style="color: #2980b9">Paid</b> <%
 } else {
 %> <b style="color: #e74c3c">Unpaid</b> <%
 }
 %>
						</td>
					</tr>
					<%
					}
					%>
					<tr>
						<td colspan="5"></td>
						<td><b>Total payment:</b></td>
						<td><%=totalMonney%> đ</td>
						<td><a id="delete-product" href="cart"><img
								src="img/remove.png" width="30" height="30"></a></td>
						<td><a id="" href="payment"><img src="img/payment.png"
								width="30" height="30"></a></td>
						<td></td>
					</tr>
				</tbody>
				<%
				}
				%>
			</table>
		</div>
		<!--  /.conatiner -->
	</section>
	<!-- End of portfolio section
		============================================= -->

	<!-- Start of footer section
		============================================= -->
	<footer>
		<div class="footer-area footer-2">
			<div class="container">
				<div class="row">
					<div class="copy-right-area text-center">
						<div class="page-head-social-item ul-li">
							<ul class="page-head-social-list">
								<li><a href="#"><span class="ti-facebook"></span></a></li>
								<li><a href="#"><span class="ti-twitter-alt"></span></a></li>
								<li><a href="#"><span class="ti-google"></span></a></li>
								<li><a href="#"><span class="ti-instagram"></span></a></li>
							</ul>
							<!-- /.page-head-soghcial-list -->
						</div>
						<span>© Nhom4 </span>
					</div>
					<!-- //copy-right-area -->
				</div>
				<!--  /.container -->
			</div>
			<!--  /.row-->
		</div>
		<!--  /.footer-area -->
	</footer>
	<!-- End of footer section
		============================================= -->



	<!--  Js Library -->
	<script src="js/jquery-2.1.4.min.js"></script>
	<!-- Include  for bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Include isotope Js -->
	<script src="js/jquery.isotope.min.js"></script>
	<!-- Include lightbox -->
	<script src="js/lightbox.js"></script>
	<!-- Include circle-effect.js -->
	<script src="js/circle-effect.js"></script>
	<!-- Include Video js -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<!-- Include Owl-carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- Include Counter up -->
	<script src="js/jquery.counterup.min.js"></script>
	<script src="js/waypoints.min.js"></script>



	<!-- Include script.js -->
	<script src="js/script.js"></script>

	<script src="js/price-view.js"></script>
</body>

</html>