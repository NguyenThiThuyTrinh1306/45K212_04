/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-04-26 08:57:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Bean.Account;
import Model.Bean.Detail;
import Model.Bean.Product;
import java.util.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Model.Bean.Account");
    _jspx_imports_classes.add("Model.Bean.Detail");
    _jspx_imports_classes.add("Model.Bean.Product");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Contact</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta name=\"description\" content=\"----\">\r\n");
      out.write("\r\n");
      out.write("<meta name=\"keywords\" content=\"Premium HTML Template\">\r\n");
      out.write("\r\n");
      out.write("<meta name=\"author\" content=\"HTMLmate\">\r\n");
      out.write("\r\n");
      out.write("<!-- Mobile Specific Meta -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!-- css-include -->\r\n");
      out.write("\r\n");
      out.write("<!-- boorstrap -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<!-- themify-icon.css -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/themify-icons.css\">\r\n");
      out.write("<!-- owl-carousel -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/owl.carousel.css\">\r\n");
      out.write("<!-- light-box -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/lightbox.css\">\r\n");
      out.write("<!-- video css -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/video.min.css\">\r\n");
      out.write("<!-- menu.css -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/menu.css\">\r\n");
      out.write("<!-- style -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("<!-- responsive.css -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/responsive.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#numProduct {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	background-color: red;\r\n");
      out.write("	color: white;\r\n");
      out.write("	width: 20px;\r\n");
      out.write("	height: 20px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	border-radius: 50%;\r\n");
      out.write("	top: 0%;\r\n");
      out.write("	right: 0%;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body class=\"about single-page\">\r\n");
      out.write("	");

	Account account = (Account) session.getAttribute("account");
	List<Detail> cart = (ArrayList<Detail>) session.getAttribute("cart");
	
      out.write("\r\n");
      out.write("	<div id=\"preloader\"></div>\r\n");
      out.write("	<!-- Start of nav bar \r\n");
      out.write("		============================================= -->\r\n");
      out.write("	<nav id=\"poppin-nav\">\r\n");
      out.write("		<div id=\"nav-off\"></div>\r\n");
      out.write("		<div id=\"header-logo-1\" class=\"text-center\">\r\n");
      out.write("			<a href=\"home\"><img src=\"img/LOGO_CHATAM.png\" alt=\"img\"> ");

 if (account != null) {
 
      out.write(" Admin ");
      out.print(account.getDisplayName());
      out.write(' ');

 } else {
 
      out.write(" Customer ");

 }
 
      out.write(" </a>\r\n");
      out.write("		</div>\r\n");
      out.write("		<ul id=\"menu\">\r\n");
      out.write("			<li class=\"has-submenu text-capitalize\"><a href=\"home\">Home\r\n");
      out.write("					Page </a></li>\r\n");
      out.write("			");

			if (account == null) {
			
      out.write("\r\n");
      out.write("			<li><a href=\"rent\">Product rental</a></li>\r\n");
      out.write("			<li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("			<li><a href=\"login_form.jsp\">Login</a></li>\r\n");
      out.write("			");

			} else {
			
      out.write("\r\n");
      out.write("			<li><a href=\"admin.jsp\">User</a></li>\r\n");
      out.write("			<li><a href=\"customers\">Customer</a></li>\r\n");
      out.write("			<li><a href=\"invoices\">Invoice</a></li>\r\n");
      out.write("			<li><a href=\"logout\">Log out</a></li>\r\n");
      out.write("			");

			}
			
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<div id=\"menu-overlay\"></div>\r\n");
      out.write("	<!-- End of nav bar \r\n");
      out.write("		============================================= -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Start of header\r\n");
      out.write("		============================================= -->\r\n");
      out.write("	<header id=\"site-header\" class=\"not-stuck\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div id=\"header-logo\">\r\n");
      out.write("					<a href=\"home\"><img src=\"img/LOGO_CHATAM.png\" alt=\"img\"></a>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div\r\n");
      out.write("					style=\"float: right; display: flex; justify-content: space-around;\">\r\n");
      out.write("					");

					if (account == null) {
					
      out.write("\r\n");
      out.write("					<div style=\"margin-right: 50px; position: relative;\">\r\n");
      out.write("						<a href=\"#\"><img src=\"img/cart.png\" width=\"50\" height=\"50\"></a>\r\n");
      out.write("						<p id=\"numProduct\">\r\n");
      out.write("							");

							if (cart == null || cart.size() == 0) {
							
      out.write("\r\n");
      out.write("							0\r\n");
      out.write("							");

							} else {
							
      out.write("\r\n");
      out.write("							");
      out.print(cart.size());
      out.write("\r\n");
      out.write("							");

							}
							
      out.write("\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("					<div id=\"menu-burger\" class=\"pull-right not-stuck\">\r\n");
      out.write("						<div id=\"menu-bar\">\r\n");
      out.write("							<span class=\"icon-bar top\"></span> <span class=\"icon-bar middle\"></span>\r\n");
      out.write("							<span class=\"icon-bar bottom\"></span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("	<!-- End of header\r\n");
      out.write("		============================================= -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Start of page head section\r\n");
      out.write("		============================================= -->\r\n");
      out.write("	<section id=\"page-head\" class=\"page-head-section\">\r\n");
      out.write("		<div class=\"page-head-overlay\"></div>\r\n");
      out.write("		<div id=\"page-head-effect\" class=\"page-head-effect\">\r\n");
      out.write("			<canvas id=\"demo-canvas\"></canvas>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- // page-head-style -->\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"page-head-content text-center\">\r\n");
      out.write("					<div class=\"page-head-title text-capitalize\">\r\n");
      out.write("						<h1>Contact Us</h1>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- //title -->\r\n");
      out.write("\r\n");
      out.write("					<div class=\"breadcrumb-item   text-capitalize\">\r\n");
      out.write("						<ul class=\"breadcrumb\">\r\n");
      out.write("							<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("							<li>contact</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- /.breadcrumb-item -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /.page-head-content -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!--  /.row-->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!--  /.container -->\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- End of page head section\r\n");
      out.write("		============================================= -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Start of contact us section\r\n");
      out.write("		============================================= -->\r\n");
      out.write("	<section id=\"contact\" class=\"contact-us-section\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row section-content\">\r\n");
      out.write("				<div class=\"contact-us-contact\">\r\n");
      out.write("					<div class=\"contact-text text-center deep-black play-fair\">\r\n");
      out.write("						<span>If you need to use our services, please contact us using the information below!</span>\r\n");
      out.write("					</div>\r\n");
      out.write("					<br>\r\n");
      out.write("					<!-- //.contact-text-->\r\n");
      out.write("\r\n");
      out.write("				<div >\r\n");
      out.write("					<iframe class=\"google-map-container\" src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3834.348436833116!2d108.23728471487406!3d16.04739864428509!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3142176215eb4ed7%3A0xd50bf793bd3ed1f2!2zNzEgTmfFqSBIw6BuaCBTxqFuLCBC4bqvYyBN4bu5IFBow7osIE5nxakgSMOgbmggU8ahbiwgxJDDoCBO4bq1bmcgNTUwMDAwLCBWaeG7h3QgTmFt!5e0!3m2!1svi!2s!4v1650961948647!5m2!1svi!2s\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"contact-adress pt90\">\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-sm-3\">\r\n");
      out.write("								<div class=\"section-title text-capitalize deep-black pb75\">\r\n");
      out.write("									<h2>Contact Us</h2>\r\n");
      out.write("								</div>\r\n");
      out.write("								<!-- //title -->\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- //col-sm-3 -->\r\n");
      out.write("\r\n");
      out.write("							<div class=\"col-sm-3\">\r\n");
      out.write("								<div class=\"service-text-icon\">\r\n");
      out.write("									<div class=\"service-icon\">\r\n");
      out.write("										<span class=\"deep-black ti-location-pin\"></span>\r\n");
      out.write("									</div>\r\n");
      out.write("									<!-- //icon -->\r\n");
      out.write("									<div class=\"service-text mt15\">\r\n");
      out.write("										<div class=\"service-title deep-black\">\r\n");
      out.write("											<h3>Address</h3>\r\n");
      out.write("										</div>\r\n");
      out.write("										<!-- //title -->\r\n");
      out.write("										<div class=\"service-dec mt15\">\r\n");
      out.write("											<span>71 Ng?? H??nh S??n, M??? An, Ng?? H??nh S??n, ???? N???ng </span>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<!-- //deccription -->\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- //col-sm-3 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<div class=\"col-sm-3\">\r\n");
      out.write("								<div class=\"service-text-icon\">\r\n");
      out.write("									<div class=\"service-icon\">\r\n");
      out.write("										<span class=\"deep-black ti-mobile\"></span>\r\n");
      out.write("									</div>\r\n");
      out.write("									<!-- //icon -->\r\n");
      out.write("									<div class=\"service-text mt15\">\r\n");
      out.write("										<div class=\"service-title deep-black\">\r\n");
      out.write("											<h3>Direct Call</h3>\r\n");
      out.write("										</div>\r\n");
      out.write("										<!-- //title -->\r\n");
      out.write("										<div class=\"service-dec mt15\">\r\n");
      out.write("											<span>+84 869 072 806<br>+1 437 800 513\r\n");
      out.write("											</span>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<!-- //deccription -->\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- //col-sm-3 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<div class=\"col-sm-3\">\r\n");
      out.write("								<div class=\"service-text-icon\">\r\n");
      out.write("									<div class=\"service-icon\">\r\n");
      out.write("										<span class=\"deep-black ti-email\"></span>\r\n");
      out.write("									</div>\r\n");
      out.write("									<!-- //icon -->\r\n");
      out.write("									<div class=\"service-text mt15\">\r\n");
      out.write("										<div class=\"service-title deep-black\">\r\n");
      out.write("											<h3>Get In Touch</h3>\r\n");
      out.write("										</div>\r\n");
      out.write("										<!-- //title -->\r\n");
      out.write("										<div class=\"service-dec mt15\">\r\n");
      out.write("											<span>quanghuy0070@gmail.com <br>191121521217@due.udn.vn\r\n");
      out.write("\r\n");
      out.write("											</span>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<!-- //deccription -->\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- //col-sm-3 -->\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- //.contact-adress -->\r\n");
      out.write("\r\n");
      out.write("					<div class=\"contact-area-form pt90\">\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-sm-3\">\r\n");
      out.write("								<div class=\"section-title text-capitalize deep-black pb75\">\r\n");
      out.write("									<h2>Drop a Mail</h2>\r\n");
      out.write("								</div>\r\n");
      out.write("								<!-- //title -->\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- //col-sm-3 -->\r\n");
      out.write("\r\n");
      out.write("							<div class=\"col-sm-9\">\r\n");
      out.write("								<div class=\"contact-adress-form\">\r\n");
      out.write("									<form id=\"contact_form\" action=\"#\" method=\"POST\"\r\n");
      out.write("										enctype=\"multipart/form-data\">\r\n");
      out.write("										<div class=\"contact-info-item\">\r\n");
      out.write("											<input class=\"name\" name=\"name\" type=\"text\"\r\n");
      out.write("												placeholder=\"Enter your name...\"> <span><i\r\n");
      out.write("												class=\"fa fa-user\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"contact-info-item\">\r\n");
      out.write("											<input class=\"email\" name=\"email\" type=\"email\"\r\n");
      out.write("												placeholder=\"Your Email\"> <span><i\r\n");
      out.write("												class=\"fa fa-envelope\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"contact-info-item\">\r\n");
      out.write("											<input class=\"sub\" name=\"name\" type=\"text\"\r\n");
      out.write("												placeholder=\"Subject ( optional )\"> <span\r\n");
      out.write("												class=\"phone\"><i class=\"fa fa-phone\"\r\n");
      out.write("												aria-hidden=\"true\"></i></span>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"contact-info-msg\">\r\n");
      out.write("											<textarea id=\"message\" name=\"message\"\r\n");
      out.write("												placeholder=\"Type your message\" rows=\"7\" cols=\"30\"></textarea>\r\n");
      out.write("											<span><i class=\"fa fa-pencil\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("										</div>\r\n");
      out.write("										<button class=\"text-uppercase\" type=\"submit\" value=\"send now\">\r\n");
      out.write("											Send Message<i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i>\r\n");
      out.write("										</button>\r\n");
      out.write("									</form>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- //.col-sm-9 -->\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- //.contact-area-form -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- //.contact-us-contact -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!--  /.row-->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!--  /.container -->\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- End of contact us section\r\n");
      out.write("		============================================= -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Start of footer section\r\n");
      out.write("		============================================= -->\r\n");
      out.write("	<footer>\r\n");
      out.write("		<div class=\"footer-area\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"copy-right-area  border-top text-center\">\r\n");
      out.write("						<span class=\"pt50 table-display\">?? QuangHuy - All Rights\r\n");
      out.write("							Reserved </span>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- //copy-right-area -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!--  /.container -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!--  /.row-->\r\n");
      out.write("			<div class=\"up\">\r\n");
      out.write("				<a href=\"#\" id=\"scrolluptop\" class=\"scrollup custom\"><span\r\n");
      out.write("					class=\"back-top deep-black text-uppercase\">back top</span></a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!--  /.footer-area -->\r\n");
      out.write("	</footer>\r\n");
      out.write("	<!-- End of footer section\r\n");
      out.write("		============================================= -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!--  Js Library -->\r\n");
      out.write("	<script src=\"js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("	<!-- Include  for bootstrap -->\r\n");
      out.write("	<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("	<!-- Include isotope Js -->\r\n");
      out.write("	<script src=\"js/jquery.isotope.min.js\"></script>\r\n");
      out.write("	<!-- Include lightbox -->\r\n");
      out.write("	<script src=\"js/lightbox.js\"></script>\r\n");
      out.write("	<!-- Include circle-effect.js -->\r\n");
      out.write("	<script src=\"js/circle-effect.js\"></script>\r\n");
      out.write("	<!-- Include Video js -->\r\n");
      out.write("	<script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("	<!-- Include Owl-carousel -->\r\n");
      out.write("	<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("	<!-- Include Counter up -->\r\n");
      out.write("	<script src=\"js/jquery.counterup.min.js\"></script>\r\n");
      out.write("	<script src=\"js/waypoints.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Include script.js -->\r\n");
      out.write("	<script src=\"js/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Google Maps Script  -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"http://maps.google.com/maps/api/js?key=AIzaSyC61_QVqt9LAhwFdlQmsNwi5aUJy9B2SyA\"></script>\r\n");
      out.write("	<script src=\"js/gmap3.min.js\"></script>\r\n");
      out.write("	<script>\r\n");
      out.write("		function isMobile() {\r\n");
      out.write("			return ('ontouchstart' in document.documentElement);\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		function init_gmap() {\r\n");
      out.write("			if (typeof google == 'undefined')\r\n");
      out.write("				return;\r\n");
      out.write("			var options = {\r\n");
      out.write("				center : [ 23.7806286, 90.2793692 ],\r\n");
      out.write("				zoom : 14,\r\n");
      out.write("				styles : [ {\r\n");
      out.write("					elementType : 'geometry',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#eeeeee'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					elementType : 'labels.text.stroke',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#eeeeee'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					elementType : 'labels.text.fill',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#eeeeee'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'administrative.locality',\r\n");
      out.write("					elementType : 'labels.text.fill',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#cdc9c2'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'poi',\r\n");
      out.write("					elementType : 'labels.text.fill',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#cdc9c2'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'poi.park',\r\n");
      out.write("					elementType : 'geometry',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#cdc9c2'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'poi.park',\r\n");
      out.write("					elementType : 'labels.text.fill',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#c6c9c3'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'road',\r\n");
      out.write("					elementType : 'geometry',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#c6c9c3'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'road',\r\n");
      out.write("					elementType : 'geometry.stroke',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#cdc9c2'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'road',\r\n");
      out.write("					elementType : 'labels.text.fill',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#cdc9c2'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'road.highway',\r\n");
      out.write("					elementType : 'geometry',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#cdc9c2'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'road.highway',\r\n");
      out.write("					elementType : 'geometry.stroke',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#cdc9c2'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'road.highway',\r\n");
      out.write("					elementType : 'labels.text.fill',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#cdc9c2'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'transit',\r\n");
      out.write("					elementType : 'geometry',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#e4e4e3'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'transit.station',\r\n");
      out.write("					elementType : 'labels.text.fill',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#e4e4e3'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'water',\r\n");
      out.write("					elementType : 'geometry',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#c3c7cc'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'water',\r\n");
      out.write("					elementType : 'labels.text.fill',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#c3c7cc'\r\n");
      out.write("					} ]\r\n");
      out.write("				}, {\r\n");
      out.write("					featureType : 'water',\r\n");
      out.write("					elementType : 'labels.text.stroke',\r\n");
      out.write("					stylers : [ {\r\n");
      out.write("						color : '#c3c7cc'\r\n");
      out.write("					} ]\r\n");
      out.write("				} ],\r\n");
      out.write("				mapTypeControl : true,\r\n");
      out.write("				mapTypeControlOptions : {\r\n");
      out.write("					style : google.maps.MapTypeControlStyle.DROPDOWN_MENU\r\n");
      out.write("				},\r\n");
      out.write("				navigationControl : true,\r\n");
      out.write("				scrollwheel : false,\r\n");
      out.write("				streetViewControl : true,\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("			if (isMobile()) {\r\n");
      out.write("				options.draggable = false;\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("			$('#googleMaps').gmap3({\r\n");
      out.write("				map : {\r\n");
      out.write("					options : options\r\n");
      out.write("				},\r\n");
      out.write("				marker : {\r\n");
      out.write("					latLng : [ 23.7806286, 90.2793692 ],\r\n");
      out.write("\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		}\r\n");
      out.write("		init_gmap();\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
