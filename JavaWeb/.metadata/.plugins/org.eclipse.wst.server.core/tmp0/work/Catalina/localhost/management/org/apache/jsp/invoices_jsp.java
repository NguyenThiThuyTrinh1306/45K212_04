/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-04-25 05:04:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import Model.Bean.Invoice;
import Model.Bean.Customer;
import java.util.HashMap;
import java.util.ArrayList;
import Model.Bean.Product;
import Model.Bean.Detail;
import java.util.List;
import Model.Bean.Account;

public final class invoices_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Model.Bean.Account");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Model.Bean.Invoice");
    _jspx_imports_classes.add("Model.Bean.Detail");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("Model.Bean.Customer");
    _jspx_imports_classes.add("Model.Bean.Product");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Invoices</title>\r\n");
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/customer_style.css\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	");

	Account account = (Account) session.getAttribute("account");
	List<Invoice> invoices = (ArrayList<Invoice>) request.getAttribute("invoices");
	SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
	
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
 
      out.write(" Khách hàng ");

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
      out.write("				<div id=\"menu-burger\" class=\"pull-right not-stuck\">\r\n");
      out.write("					<div id=\"menu-bar\">\r\n");
      out.write("						<span class=\"icon-bar top\"></span> <span class=\"icon-bar middle\"></span>\r\n");
      out.write("						<span class=\"icon-bar bottom\"></span>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("	<!-- Start of portfolio section\r\n");
      out.write("		============================================= -->\r\n");
      out.write("	<section id=\"portfolio\" class=\"portfolio-section\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"title-page-management\">\r\n");
      out.write("				<h2>Invoice Management</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"box-search-invoices\">\r\n");
      out.write("				<input id=\"input-search-invoices\" oninput=\"searchInvoice()\"\r\n");
      out.write("					type=\"text\" placeholder=\"Enter invoice id or name customer ...\" />\r\n");
      out.write("				<div class=\"ti-search\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<table class=\"table\">\r\n");
      out.write("				<thead>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th scope=\"col\">#</th>\r\n");
      out.write("						<th scope=\"col\">Invoice ID</th>\r\n");
      out.write("						<th scope=\"col\">Customer</th>\r\n");
      out.write("						<th scope=\"col\">Hire time</th>\r\n");
      out.write("						<th scope=\"col\">Total payment</th>\r\n");
      out.write("						<th scope=\"col\" colspan=\"2\"></th>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</thead>\r\n");
      out.write("				<tbody id=\"tbody-invoices\">\r\n");
      out.write("					");

					int index = 1;
					for (Invoice invoice : invoices) {
					
      out.write("\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th scope=\"row\">");
      out.print(index++);
      out.write("</th>\r\n");
      out.write("						<td>");
      out.print(invoice.getId());
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(invoice.getCustomer().getName());
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(dateFormat.format(invoice.getTime()));
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(invoice.getTotalMoney());
      out.write("</td>\r\n");
      out.write("						<td><a href=\"detail?id=");
      out.print(invoice.getId());
      out.write("\"><img\r\n");
      out.write("								src=\"img/detail.png\" width=\"30\" height=\"30\"></a></td>\r\n");
      out.write("						<td><button id=\"btn-delete-invoice\"\r\n");
      out.write("								onClick=\"deleteInvoice(");
      out.print(invoice.getId());
      out.write(")\">\r\n");
      out.write("								<img src=\"img/remove.png\" width=\"30\" height=\"30\">\r\n");
      out.write("							</button></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("				</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!--  /.conatiner -->\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- End of portfolio section\r\n");
      out.write("		============================================= -->\r\n");
      out.write("\r\n");
      out.write("	<!-- Start of footer section\r\n");
      out.write("		============================================= -->\r\n");
      out.write("	<footer>\r\n");
      out.write("		<div class=\"footer-area footer-2\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"copy-right-area text-center\">\r\n");
      out.write("						<div class=\"page-head-social-item ul-li\">\r\n");
      out.write("							<ul class=\"page-head-social-list\">\r\n");
      out.write("								<li><a href=\"#\"><span class=\"ti-facebook\"></span></a></li>\r\n");
      out.write("								<li><a href=\"#\"><span class=\"ti-twitter-alt\"></span></a></li>\r\n");
      out.write("								<li><a href=\"#\"><span class=\"ti-google\"></span></a></li>\r\n");
      out.write("								<li><a href=\"#\"><span class=\"ti-instagram\"></span></a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("							<!-- /.page-head-soghcial-list -->\r\n");
      out.write("						</div>\r\n");
      out.write("						<span>© Nhom4 </span>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- //copy-right-area -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!--  /.container -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!--  /.row-->\r\n");
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
      out.write("	<!-- Include script.js -->\r\n");
      out.write("	<script src=\"js/script.js\"></script>\r\n");
      out.write("	<script src=\"js/invoice_script.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
