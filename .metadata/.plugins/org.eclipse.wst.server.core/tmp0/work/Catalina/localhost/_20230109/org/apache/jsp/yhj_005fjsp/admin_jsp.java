/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.84
 * Generated at: 2023-01-19 11:32:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.yhj_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import yhj_java.user.User;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("yhj_java.user.User");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@200&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.rtl.min.css\"\r\n");
      out.write("	integrity=\"sha384-WJUUqfoMmnfkBLne5uxXj+na/c7sesSJ32gI7GfCk4zO4GthUKhSEGyvQ839BC51\"\r\n");
      out.write("	crossorigin=\"anonymous\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/admin.css\" />\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/089f36b7b1.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<title>admin</title>\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("	list-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("	text-decoration: none !important;\r\n");
      out.write("	color: #fff !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("	border: none;\r\n");
      out.write("	vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("	overflow-x: hidden;\r\n");
      out.write("	padding-top: 75px;\r\n");
      out.write("	padding-left:317px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".iconicon {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".iconicon a:last-child {\r\n");
      out.write("	margin-left: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".iconicon a:last-child i {\r\n");
      out.write("	color: #e15959;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".iconicon a:first-child {\r\n");
      out.write("	margin-right: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".iconicon li:nth-last-child(2) {\r\n");
      out.write("	margin-left: 75px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".iconicon a:nth-last-child(3) {\r\n");
      out.write("	margin-left: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".iconicon a i:hover {\r\n");
      out.write("	color: #e15959;\r\n");
      out.write("	transition: 0.5s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".height75 {\r\n");
      out.write("	height: 75px;\r\n");
      out.write("	position:fixed;\r\n");
      out.write("	top:0;\r\n");
      out.write("	left:317px;\r\n");
      out.write("	z-index: 9999;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rowheight75 {\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	height: 75px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rowheight75 div:last-child {\r\n");
      out.write("	padding-top: 14px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-xl-2 bg-dark\"\r\n");
      out.write("				style=\"position: fixed; left: 0; top: 0; font-size: 20px; height: 100vh\">\r\n");
      out.write("				<div>\r\n");
      out.write("					<a href=admin.jsp><img src=\"./image/11111.png\" alt=\"\"\r\n");
      out.write("						width=\"50\" class=\"rouded-circle mr-3\" /></a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div>\r\n");
      out.write("					<a href=\"admin.jsp\"\r\n");
      out.write("						class=\"navbar-brand text-white text-center d-block mx-auto py-3 mb-4 bottom-border\"><h2>관리자\r\n");
      out.write("							기능 목록</h2></a>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<ul class=\"navbar-nav flex-column mt-4\">\r\n");
      out.write("					<li class=\"nav-item\"><a href=\"#\"\r\n");
      out.write("						class=\"btnA nav-link text-white p-3 mb-2 sidebar-link\"> <i\r\n");
      out.write("							class=\"fa-sharp fa-solid fa-store\"></i> 상품 관리\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\"navbar-list\"><a href=\"ProductAdd.jsp\">상품 등록</a><br />\r\n");
      out.write("						<a href=\"productList.jsp\">상품 목록</a><br /> <a href=\"\">상품 수정</a><br />\r\n");
      out.write("						<a href=\"\">상품 제거</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<ul class=\"navbar-nav flex-column mt-4\">\r\n");
      out.write("					<li class=\"nav-item\"><a href=\"#\"\r\n");
      out.write("						class=\"btnB nav-link text-white p-3 mb-2 sidebar-link\"> <i\r\n");
      out.write("							class=\"fa-sharp fa-solid fa-person-through-window\"></i> 회원 관리\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\"navbar-list\"><a href=\"\">회원 조회</a><br /> <a href=\"\">회원\r\n");
      out.write("							수정</a><br /> <a href=\"\">회원 제거</a><br /></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-xl-10 bg-dark height75\">\r\n");
      out.write("				<div class=\"row rowheight75\">\r\n");
      out.write("					<div class=\"col-md-4\">\r\n");
      out.write("						<h4 class=\"text-light text-uppercase mb-0\">관리자 페이지</h4>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-md-5\">\r\n");
      out.write("						<form action=\"\">\r\n");
      out.write("							<div class=\"input-group\">\r\n");
      out.write("								<input type=\"text\" class=\"form-control search-input\"\r\n");
      out.write("									placeholder=\"Search...\" style=\"color: #fff;\">\r\n");
      out.write("								<button type=\"button\"\r\n");
      out.write("									style=\"width: 50px; height: 50px; background: #fff; border-radius: 50%;\">\r\n");
      out.write("									<i class=\"fas fa-search text-danger\"></i>\r\n");
      out.write("								</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-md-3\">\r\n");
      out.write("						<ul class=\"iconicon\">\r\n");
      out.write("							<a href=\"#\"><i class=\"fas fa-comments fa-lg\"></i></a>\r\n");
      out.write("							<a href=\"#\"><i class=\"fas fa-bell fa-lg\"></i></a>\r\n");
      out.write("							<a href=\"index.jsp\"><i class=\"fa-solid fa-house\"></i></i></a>\r\n");
      out.write("							");

								String Sid = (String) session.getAttribute("adminName");
								if (Sid != null) {
							
      out.write("\r\n");
      out.write("							<li style=\"color:white\">");
      out.print(Sid);
      out.write("님 환영합니다</li>\r\n");
      out.write("							");

								}
							
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<a href=\"logoutAction.jsp\"><i class=\"fas fa-sign-out-alt fa-lg\"></i></a>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("\r\n");
      out.write("		<!-- Optional JavaScript; choose one of the two! -->\r\n");
      out.write("\r\n");
      out.write("		<!-- Option 1: Bootstrap Bundle with Popper -->\r\n");
      out.write("		<script\r\n");
      out.write("			src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("			integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\"\r\n");
      out.write("			crossorigin=\"anonymous\"></script>\r\n");
      out.write("		<!-- Option 2: Separate Popper and Bootstrap JS -->\r\n");
      out.write("		<!--\r\n");
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js\" integrity=\"sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("      -->\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("      var BtnA = document.querySelector(\".btnA\");\r\n");
      out.write("      var BtnB = document.querySelector(\".btnB\");\r\n");
      out.write("\r\n");
      out.write("      var active = document.querySelectorAll(\".navbar-list\");\r\n");
      out.write("\r\n");
      out.write("      BtnA.addEventListener(\"click\", ()=> {\r\n");
      out.write("        active[0].classList.toggle(\"active\");\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      BtnB.addEventListener(\"click\", ()=> {\r\n");
      out.write("        active[1].classList.toggle(\"active\");\r\n");
      out.write("      });\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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