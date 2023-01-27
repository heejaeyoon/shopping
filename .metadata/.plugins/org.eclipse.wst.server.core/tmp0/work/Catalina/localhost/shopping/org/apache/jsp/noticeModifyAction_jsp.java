/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.84
 * Generated at: 2023-01-18 10:13:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nhy_java.dao.Dao;
import nhy_java.notice.NoticeDto;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.PrintWriter;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.MultipartRequest;
import java.io.File;

public final class noticeModifyAction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("nhy_java.notice.NoticeDto");
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("com.oreilly.servlet.multipart.DefaultFileRenamePolicy");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("nhy_java.dao.Dao");
    _jspx_imports_classes.add("com.oreilly.servlet.MultipartRequest");
    _jspx_imports_classes.add("java.io.File");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

PrintWriter writer = response.getWriter();

request.setCharacterEncoding("utf-8");

//C:\JavaProgramming\eclipse\source\_20230109\WebContent\nhy_jsp\\uploadFile
String savePath = "../source"+ request.getServletContext().getContextPath() + "/WebContent/nhy_jsp/uploadFile";

//파일 크기 15MB로 제한
int sizeLimit = 1024 * 1024 * 15;
MultipartRequest mr = new MultipartRequest(request, savePath, sizeLimit, "utf-8", new DefaultFileRenamePolicy());

File file = mr.getFile("selectedFile");
File newFile = null;

if (file == null) {
	//writer.println("<script>");
	//writer.println("alert('첨부된 파일이 없습니다.')");
	//writer.println("location.href='notice.jsp'");
	//writer.println("</script>");
} else {
	String oldName = mr.getFilesystemName("selectedFile");//자동으로 생성된 파일명
	String extension = oldName.substring(oldName.lastIndexOf("."), oldName.length());//확장자
	String now = new SimpleDateFormat("yyyyMMddHHmmssS").format(new Date());//현재시간
	
	//신규 파일명 : 세션아이디_현재시간_확장자
	newFile = new File(savePath + File.separator + session.getAttribute("loginId") + "_" + now + extension);
	file.renameTo(newFile);//파일명 수정
	System.out.println("**********************************************************");
	System.out.println("saveFile Name : " + file.getName());
	System.out.println("realFile Name : " + newFile.getName());
	System.out.println("File Size : " + newFile.length());
	System.out.println("**********************************************************");
}
	System.out.println("**********************************************************");
	System.out.println("Author : " + session.getAttribute("loginId"));
	System.out.println("Title : " + mr.getParameter("title"));
	System.out.println("Content : " + mr.getParameter("content"));
	System.out.println("**********************************************************");
	
	int idx = Integer.parseInt(mr.getParameter("idx"));
	String author = (String)session.getAttribute("loginId");
	String title = mr.getParameter("title");
	String content = mr.getParameter("content");
	String saveFileName = file==null ? null : file.getName();
	String realFileName = newFile==null ? null : newFile.getName();
	String createDate = "";
	int hit = 0;
	String modifyDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
	NoticeDto noticeDto = new NoticeDto(idx, author, title, content, saveFileName, realFileName, createDate, hit, modifyDate);
	Dao dao = Dao.getInstance();
	int result = dao.notice_update(noticeDto);
	
	if(result == 1) {
		writer.println("<script>");
		writer.println("alert('글 수정 완료.')");
		writer.println("location.href='notice.jsp'");
		writer.println("</script>");		
	} else {
		writer.println("<script>");
		writer.println("alert('글 수정 실패.')");
		writer.println("location.href='notice.jsp'");
		writer.println("</script>");
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Notice Write Action</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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