/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.84
 * Generated at: 2023-01-17 04:41:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.nhy_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Header</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/header2.css\" />\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/089f36b7b1.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"js/header2.js\" defer></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<nav class=\"navbar\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"navbar_logo\">\r\n");
      out.write("			<i class=\"fa-solid fa-store\"></i> <a target=\"iframe1\" href=\"main.jsp\">\r\n");
      out.write("				Market Kurly</a>\r\n");
      out.write("		</div>\r\n");
      out.write("		<form class= \"search1\">\r\n");
      out.write("			<input class=\"search\" type=\"search\" placeholder=\"Search\" /> <span class=text>검색</span>\r\n");
      out.write("		</form>\r\n");
      out.write("		<ul class=\"navbar_menu\">\r\n");
      out.write("			<li><a href=\"\" class=\"aa\">신상품</a></li>\r\n");
      out.write("			<li><a href=\"\" class=\"aa\">베스트</a></li>\r\n");
      out.write("			<li><a href=\"\" class=\"aa\">알뜰쇼핑</a></li>\r\n");
      out.write("			<li><a href=\"\" class=\"aa\">특가/혜택</a></li>\r\n");
      out.write("			<li><a target=\"iframe1\" href=\"notice.jsp\" class=\"aa\">고객센터</a></li>\r\n");
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("\r\n");
      out.write("		<ul class=\"navbar_login\">\r\n");
      out.write("\r\n");
      out.write("			");

				if (session.getAttribute("userId") == null) {
			
      out.write("\r\n");
      out.write("			<li><a href=\"login.jsp\">로그인</a></li>\r\n");
      out.write("			<li><a href=\"register.jsp\">회원가입</a></li>\r\n");
      out.write("			");

				} else {
			
      out.write("\r\n");
      out.write("			<li><a href=\"logoutAction.jsp\">로그아웃</a></li>\r\n");
      out.write("			");

				}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("		<ul class=\"navbar_icons\">\r\n");
      out.write("			<li><i class=\"fa-solid fa-cart-shopping\"></i></li>\r\n");
      out.write("			<li><i class=\"fa-sharp fa-solid fa-heart\"></i></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("\r\n");
      out.write("		<a href=\"#\" class=\"navbar_togleBtn\"> <i\r\n");
      out.write("			class=\"fa-sharp fa-solid fa-bars\"></i>\r\n");
      out.write("		</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</nav>\r\n");
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
