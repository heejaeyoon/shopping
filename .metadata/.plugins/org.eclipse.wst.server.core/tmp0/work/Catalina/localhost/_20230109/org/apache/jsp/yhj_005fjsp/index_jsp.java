/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.84
 * Generated at: 2023-01-19 11:32:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.yhj_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write('\r');
      out.write('\n');

	String userId = (String) session.getAttribute("userId");
	if(userId==null){
		System.out.println("세션 없음");
	} else {
		System.out.println("세션 있음");
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Main</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/reset.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/index.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "popup.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("	<section id=\"main\" align=center>\r\n");
      out.write("		<article id=\"article1\">\r\n");
      out.write("			<iframe id=\"iframe1\" name=\"iframe1\" src=\"main.jsp\" width=\"1000px\" height=\"700px\" seamless></iframe>\r\n");
      out.write("		</article>\r\n");
      out.write("	</section>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("	<div align=\"right\">\r\n");
      out.write("		<div id=\"chatBox\">\r\n");
      out.write("			<div id=\"messageWindow\"></div>\r\n");
      out.write("			<div id=\"inputWindow\" align=\"center\">\r\n");
      out.write("	            <input id=\"inputMessage\" type=\"text\" onkeyup=\"enterkey()\">\r\n");
      out.write("	            <input type=\"button\" value=\"send\" onclick=\"send()\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"chatButton\" align=\"center\" onclick=\"chatToggle()\"><i class=\"fas fa-comments fa-lg\"></i></div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		let webSocket;\r\n");
      out.write("		let textarea = document.getElementById(\"messageWindow\");\r\n");
      out.write("	    let inputMessage = document.getElementById('inputMessage');\r\n");
      out.write("	    \r\n");
      out.write("		function chatToggle() {\r\n");
      out.write("			if ($(\"#chatBox\").css(\"display\")==\"block\"){\r\n");
      out.write("				$(\"#chatBox\").hide();\r\n");
      out.write("				webSocket.send(\"SYSTEM|");
      out.print(userId);
      out.write("님이 퇴장하셨습니다.\");\r\n");
      out.write("				webSocket.close();\r\n");
      out.write("			} else {\r\n");
      out.write("				$(\"#chatBox\").show();\r\n");
      out.write("				webSocket = new WebSocket('ws://172.30.1.77:8080");
      out.print(request.getContextPath() );
      out.write("/broadcasting');\r\n");
      out.write("				webSocket.onerror = function(event) {\r\n");
      out.write("			        onError(event)\r\n");
      out.write("			    };\r\n");
      out.write("			    webSocket.onopen = function(event) {\r\n");
      out.write("			        onOpen(event)\r\n");
      out.write("			        webSocket.send(\"SYSTEM|");
      out.print(userId);
      out.write("님이 입장하셨습니다.\");\r\n");
      out.write("			    };\r\n");
      out.write("			    webSocket.onmessage = function(event) {\r\n");
      out.write("			        onMessage(event)\r\n");
      out.write("			    };\r\n");
      out.write("			}\r\n");
      out.write("		};\r\n");
      out.write("		\r\n");
      out.write("	    function onMessage(event) {\r\n");
      out.write("	        let message = event.data.split(\"|\");\r\n");
      out.write("	        let sender = message[0];\r\n");
      out.write("	        let content = message[1];\r\n");
      out.write("	        if (content != \"\") {\r\n");
      out.write("	        	$(\"#messageWindow\").html($(\"#messageWindow\").html()\r\n");
      out.write("                        + \"<p class='chat_content'>\" + sender + \" : \" + content + \"</p>\");\r\n");
      out.write("	        }\r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	    function onOpen(event) {\r\n");
      out.write("	        $(\"#messageWindow\").html(\"<p class='chat_content'>채팅에 참여하였습니다.</p>\");\r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	    function onError(event) {\r\n");
      out.write("	        alert(event.data);\r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	    function send() {\r\n");
      out.write("	        if (inputMessage.value != \"\") {\r\n");
      out.write("	            $(\"#messageWindow\").html(\r\n");
      out.write("	            		$(\"#messageWindow\").html() + \"<p class='chat_content'>나 : \" + inputMessage.value + \"</p>\"\r\n");
      out.write("	            		);\r\n");
      out.write("	        }\r\n");
      out.write("	        webSocket.send(\"");
      out.print(userId);
      out.write("\" + \"|\" + inputMessage.value);\r\n");
      out.write("	        inputMessage.value = \"\";\r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	    //엔터키를 통해 send함\r\n");
      out.write("	    function enterkey() {\r\n");
      out.write("	        if (window.event.keyCode == 13) {\r\n");
      out.write("	            send();\r\n");
      out.write("	        }\r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	    //채팅이 많아져 스크롤바가 넘어가더라도 자동적으로 스크롤바가 내려가게함\r\n");
      out.write("	    window.setInterval(function() {\r\n");
      out.write("	        let elem = document.getElementById('messageWindow');\r\n");
      out.write("	        elem.scrollTop = elem.scrollHeight;\r\n");
      out.write("	    }, 0);\r\n");
      out.write("	    \r\n");
      out.write("	    //브라우저 창을 닫을때 퇴장 메세지 전송\r\n");
      out.write("	    window.addEventListener('beforeunload', function(){\r\n");
      out.write("    		webSocket.send(\"SYSTEM|");
      out.print(userId);
      out.write("님이 퇴장하셨습니다.\");\r\n");
      out.write("	    });\r\n");
      out.write("	</script>\r\n");
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
