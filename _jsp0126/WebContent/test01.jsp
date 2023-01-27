<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String aa = "test";
// 	session.setAttribute("aa", "test");
// 	application.setAttribute("aa1", "test");
	pageContext.setAttribute("aa2", "test2");
	request.setAttribute("aa1", "test1");
	
%>	
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${'십'+'12'}<br>
${'10'+'12'}<br>
${'10'+12}<br>
${'10'}${'12'}<br>
${aa1 }<br>
${aa2 }<br>
${	applicationScope.aa }
</body>
</html>