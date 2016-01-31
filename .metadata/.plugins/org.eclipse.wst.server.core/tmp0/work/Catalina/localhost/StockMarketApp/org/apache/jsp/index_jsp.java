/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.30
 * Generated at: 2015-12-31 06:42:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.uic.se.stockapp.dbcon.DatabaseConstants;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.uic.se.stockapp.dbcon.DatabaseConstants");
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title></title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/metro.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/metro-icons.css\">\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Metro UI CSS JavaScript plugins -->\n");
      out.write("<script src=\"js/metro.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction checkForm(form) {\n");
      out.write("\t\tre = /^\\w+$/;\n");
      out.write("\t\tif (!re.test(form.username_reg.value)) {\n");
      out.write("\t\t\talert(\"Error: Username must contain only letters, numbers and underscores!\");\n");
      out.write("\t\t\tform.username_reg.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tif (form.password_reg.value != \"\"\n");
      out.write("\t\t\t\t&& form.password_reg.value == form.password_reg.value) {\n");
      out.write("\t\t\tif (form.password_reg.value.length < 6) {\n");
      out.write("\t\t\t\talert(\"Error: Password must contain at least six characters!\");\n");
      out.write("\t\t\t\tform.password_reg.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif (form.password_reg.value == form.username_reg.value) {\n");
      out.write("\t\t\t\talert(\"Error: Password must be different from Username!\");\n");
      out.write("\t\t\t\tform.password_reg.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tre = /[0-9]/;\n");
      out.write("\t\t\tif (!re.test(form.password_reg.value)) {\n");
      out.write("\t\t\t\talert(\"Error: password must contain at least one number (0-9)!\");\n");
      out.write("\t\t\t\tform.password_reg.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tre = /[a-z]/;\n");
      out.write("\t\t\tif (!re.test(form.password_reg.value)) {\n");
      out.write("\t\t\t\talert(\"Error: password must contain at least one lowercase letter (a-z)!\");\n");
      out.write("\t\t\t\tform.password_reg.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tre = /[A-Z]/;\n");
      out.write("\t\t\tif (!re.test(form.password_reg.value)) {\n");
      out.write("\t\t\t\talert(\"Error: password must contain at least one uppercase letter (A-Z)!\");\n");
      out.write("\t\t\t\tform.password_reg.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\talert(\"Error: Please check that you've entered and confirmed your password!\");\n");
      out.write("\t\t\tform.psw3.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tif (form.password_reg.value != form.psw3.value) {\n");
      out.write("\t\t\talert(\"Error: Passwords do not match!\");\n");
      out.write("\t\t\tform.psw3.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t/*alert(\"You entered a valid password: \" + form.psw2.value);\n");
      out.write("\t\treturn true;*/\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"tile-container bg-darkCobalt\">\n");
      out.write("\n");
      out.write("\t<div id=\"fb-root\"></div>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t\twindow.fbAsyncInit = function() {\n");
      out.write("\t\t\tFB.init({\n");
      out.write("\t\t\t\tappId : '1052493241442130',\n");
      out.write("\t\t\t\tstatus : true,\n");
      out.write("\t\t\t\tcookie : true,\n");
      out.write("\t\t\t\txfbml : true\n");
      out.write("\t\t\t});\n");
      out.write("\t\t};\n");
      out.write("\n");
      out.write("\t\t// Load the SDK asynchronously\n");
      out.write("\t\t(function(d) {\n");
      out.write("\t\t\tvar js, id = 'facebook-jssdk', ref = d\n");
      out.write("\t\t\t\t\t.getElementsByTagName('script')[0];\n");
      out.write("\t\t\tif (d.getElementById(id)) {\n");
      out.write("\t\t\t\treturn;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tjs = d.createElement('script');\n");
      out.write("\t\t\tjs.id = id;\n");
      out.write("\t\t\tjs.async = true;\n");
      out.write("\t\t\tjs.src = \"https://connect.facebook.net/en_US/all.js\";\n");
      out.write("\t\t\tref.parentNode.insertBefore(js, ref);\n");
      out.write("\t\t}(document));\n");
      out.write("\n");
      out.write("\t\tfunction login() {\n");
      out.write("\t\t\tFB.login(function(response) {\n");
      out.write("\n");
      out.write("\t\t\t\t// handle the response\n");
      out.write("\t\t\t\tconsole.log(\"Response goes here!\");\n");
      out.write("\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\tscope : 'publish_actions'\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction logout() {\n");
      out.write("\t\t\tFB.logout(function(response) {\n");
      out.write("\t\t\t\t// user is now logged out\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tvar status = FB.getLoginStatus();\n");
      out.write("\n");
      out.write("\t\tconsole.log(status);\n");
      out.write("\n");
      out.write("\t\tfunction notifyOnErrorInput(input) {\n");
      out.write("\t\t\tvar message = input.data('validateHint');\n");
      out.write("\t\t\t$.Notify({\n");
      out.write("\t\t\t\tcaption : 'Error',\n");
      out.write("\t\t\t\tcontent : message,\n");
      out.write("\t\t\t\ttype : 'alert'\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction loadContactUsContent() {\n");
      out.write("\t\t\tvar win = window.open('https://www.facebook.com/akhil.kateja',\n");
      out.write("\t\t\t\t\t'_blank');\n");
      out.write("\t\t\twin.focus();\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction loadFindOnFBcontent() {\n");
      out.write("\t\t\tvar win = window.open(\n");
      out.write("\t\t\t\t\t'https://www.facebook.com/VirtualStockExchangeGames',\n");
      out.write("\t\t\t\t\t'_blank');\n");
      out.write("\t\t\twin.focus();\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<div class=\"grid condensed\">\n");
      out.write("\t\t<div class=\"row cells12\">\n");
      out.write("\t\t\t<div class=\"cell colspan3\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"tile-large bg-grayLight\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"tile-content slide-LEFT-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"image-container image-format-fill\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frame\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%; border-radius: 0px; background-image: url(images/download.png); background-size: cover; background-repeat: no-repeat;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t");

								if (request.getAttribute("LOGIN STATUS") != null
										&& ((String) request.getAttribute("LOGIN STATUS")).equalsIgnoreCase("FAILED")) {
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #FF0000\">Login\n");
      out.write("\t\t\t\t\t\t\t\tFailed, Invalid Username Password Entered</span>\n");
      out.write("\t\t\t\t\t\t\t");

								request.setAttribute("LOGIN STATUS", DatabaseConstants.EMPTY_STRING);
								} else {
									request.setAttribute("LOGIN STATUS", DatabaseConstants.EMPTY_STRING);
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #ffffff\">Login</span>\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"slide-over\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div id=\"container_login row\">\n");
      out.write("\t\t\t\t\t\t\t\t<form method=\"post\" action=\"login\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"table border\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 275px; margin: 0 auto; margin-top: 20px\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"caption bg-black fg-white\">LOGIN</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"no-padding\" style=\"padding-left: 5px !important;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-control modern text iconic\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdata-role=\"input\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username_login\" required\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"padding-right: 5px;\"> <span class=\"label\">Username</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"informer\">Please enter your username</span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"placeholder\" style=\"display: block;\">Username</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"icon mif-user\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"no-padding\" style=\"padding-left: 5px !important;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-control modern password iconic\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdata-role=\"input\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" required name=\"password_login\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"padding-right: 5px;\"> <span class=\"label\">Password</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"informer\">Please enter your login\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpassword</span> <span class=\"placeholder\" style=\"display: block;\">Password</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"icon mif-user\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\"><input type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"bg-black fg-white\" value=\"Login\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"tile bg-darkBlue fg-white\" onclick=\"javascript:login();\">\n");
      out.write("\t\t\t\t\t<div class=\"tile-content slide-DOWN-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tile-content iconic\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon mif-facebook\"></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"slide-over\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #ffffff; font-size: 20\">Login\n");
      out.write("\t\t\t\t\t\t\t\twith Facebook</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"tile bg-red fg-white\">\n");
      out.write("\t\t\t\t\t<div class=\"tile-content slide-DOWN-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tile-content iconic\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon mif-google\"></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"slide-over\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #ffffff; font-size: 20\">Login\n");
      out.write("\t\t\t\t\t\t\t\twith Google</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"tile bg-lighterBlue fg-white\">\n");
      out.write("\t\t\t\t\t<div class=\"tile-content slide-DOWN-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tile-content iconic\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon mif-twitter\"></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"slide-over\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #ffffff; font-size: 20\">Login\n");
      out.write("\t\t\t\t\t\t\t\twith Twitter</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"tile bg-Blue fg-white\">\n");
      out.write("\t\t\t\t\t<div class=\"tile-content slide-DOWN-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tile-content iconic\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon mif-linkedin\"></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"slide-over\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #ffffff; font-size: 20\">Login\n");
      out.write("\t\t\t\t\t\t\t\twith Linkedin</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"cell colspan6\" style=\"height: 50%; width: 53%\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"carousel\" data-role=\"carousel\" data-height=\"100%\"\n");
      out.write("\t\t\t\t\tdata-control-next=\"<span class='mif-chevron-right'></span>\"\n");
      out.write("\t\t\t\t\tdata-control-prev=\"<span class='mif-chevron-left'></span>\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/tradein.png\" data-role=\"fitImage\"\n");
      out.write("\t\t\t\t\t\t\tdata-format=\"fill\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/tradein.png\" data-role=\"fitImage\"\n");
      out.write("\t\t\t\t\t\t\tdata-format=\"fill\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/tradein.png\" data-role=\"fitImage\"\n");
      out.write("\t\t\t\t\t\t\tdata-format=\"fill\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"tile-wide bg-blue fg-white\"\n");
      out.write("\t\t\t\t\tstyle=\"margin-right: 50; margin-top: 10\">\n");
      out.write("\t\t\t\t\t<div class=\"tile-content slide-DOWN-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"image-container image-format-fill\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frame\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%; border-radius: 0px; background-image: url(images/portfolio.png); background-size: cover; background-repeat: no-repeat;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"slide-over\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #ffffff; font-size: 20\">My\n");
      out.write("\t\t\t\t\t\t\t\tStocks Portfolio</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"tile-wide bg-darkGreen fg-white\" style=\"margin-top: 10\">\n");
      out.write("\t\t\t\t\t<div class=\"tile-content slide-DOWN-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"image-container image-format-fill\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frame\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%; border-radius: 0px; background-image: url(images/Finance-App-Icon.png); background-size: cover; background-repeat: no-repeat;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"slide-over\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #ffffff; font-size: 20\">View\n");
      out.write("\t\t\t\t\t\t\t\tMarket Trends</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"tile-wide bg-black fg-white\" style=\"margin-right: 50\">\n");
      out.write("\t\t\t\t\t<div class=\"tile-content slide-DOWN-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"image-container image-format-fill\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frame\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%; border-radius: 0px; background-image: url(images/stocks-buy-sell.jpg); background-size: cover; background-repeat: no-repeat;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"slide-over\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #ffffff; font-size: 20\">Buy\n");
      out.write("\t\t\t\t\t\t\t\tand Sell Stocks</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"tile-wide bg-violet fg-white\"\n");
      out.write("\t\t\t\t\tonclick=\"javascript:loadContactUsContent();\">\n");
      out.write("\t\t\t\t\t<div class=\"tile-content slide-DOWN-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"image-container image-format-fill\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frame\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%; border-radius: 0px; background-image: url(images/contact_us.png); background-size: cover; background-repeat: no-repeat;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"slide-over\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #ffffff; font-size: 20\">Contact\n");
      out.write("\t\t\t\t\t\t\t\tUs</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"cell colspan2\">\n");
      out.write("\t\t\t\t<div class=\"tile-large bg-grayLight\" style=\"height: 75%\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"tile-content slide-LEFT-2\" style=\"height: 100%\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"image-container image-format-fill\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frame\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%; border-radius: 0px; background-image: url(images/images.jpg); background-size: cover; background-repeat: no-repeat;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t");

								if (request.getAttribute("REG STATUS") != null
										&& ((String) request.getAttribute("REG STATUS")).equalsIgnoreCase("SUCCESS")) {
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #ffffff\">Registration\n");
      out.write("\t\t\t\t\t\t\t\tSuccessful. <br /> Please proceed to Login.\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t");

								request.setAttribute("REG STATUS", DatabaseConstants.EMPTY_STRING);
								} else if (request.getAttribute("REG STATUS") != null
										&& ((String) request.getAttribute("REG STATUS")).equalsIgnoreCase("FAILED")) {
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #FF0000\">Registration\n");
      out.write("\t\t\t\t\t\t\t\tFailed, Please Try Again.</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

								request.setAttribute("REG STATUS", DatabaseConstants.EMPTY_STRING);
								} else {
									request.setAttribute("REG STATUS", DatabaseConstants.EMPTY_STRING);
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #ffffff\">Register</span>\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"slide-over\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"container_login row\">\n");
      out.write("\t\t\t\t\t\t\t\t<form method=\"post\" action=\"register\"\n");
      out.write("\t\t\t\t\t\t\t\t\tonsubmit=\"return checkForm(this);\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"table border\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 275px; margin: 0 auto; margin-top: 20px\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"caption bg-black fg-white\">REGISTER</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"no-padding\" style=\"padding-left: 5px !important;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-control modern text iconic\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdata-role=\"input\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" style=\"padding-right: 5px;\" required\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"username_reg\"> <span class=\"label\">Username</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"informer\">Please enter your username</span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"placeholder\" style=\"display: block;\">Username</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"icon mif-user\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"no-padding\" style=\"padding-left: 5px !important;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-control modern password iconic\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdata-role=\"input\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" required name=\"password_reg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"padding-right: 5px;\"> <span class=\"label\">Password</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"informer\">Please enter your login\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tPassword</span> <span class=\"placeholder\" style=\"display: block;\">Password</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"icon mif-user\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"no-padding\" style=\"padding-left: 5px !important;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-control modern password iconic\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdata-role=\"input\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"psw3\" required\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"padding-right: 5px;\"> <span class=\"label\">Confirm\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tPassword</span> <span class=\"informer\">Please re-enter\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tyour Password</span> <span class=\"placeholder\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"display: block;\">Confirm Password</span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"icon mif-user\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"no-padding\" style=\"padding-left: 5px !important;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-control modern text iconic\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdata-role=\"input\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"email\" required name=\"email_reg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"padding-right: 5px;\"> <span class=\"label\">Email</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"informer\">Please enter your Email\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tAddress</span> <span class=\"placeholder\" style=\"display: block;\">Email</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"icon mif-user\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\"><input type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"bg-black fg-white\" value=\"REGISTER\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"tile-wide bg-darkBlue fg-white\"\n");
      out.write("\t\t\t\t\tonclick=\"javascript:loadFindOnFBcontent();\">\n");
      out.write("\t\t\t\t\t<div class=\"tile-content slide-DOWN-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slide\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"image-container image-format-fill\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frame\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 100%; height: 100%; border-radius: 0px; background-image: url(images/rate.jpg); background-size: cover; background-repeat: no-repeat;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"slide-over\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tile-label\" style=\"color: #ffffff; font-size: 20\">Find\n");
      out.write("\t\t\t\t\t\t\t\tus on Facebook</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
