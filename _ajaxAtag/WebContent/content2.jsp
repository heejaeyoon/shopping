<%@page import="java.util.List"%>
<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//int num = Integer.parseInt(request.getParameter("empno"));
	EmpDao ed = EmpDao.getInstance();
	//Emp emp = ed.select(num);
	List<Emp> aa = ed.realSelectAll();
	aa.stream().forEach(n->System.out.println(n));
	//out.print(emp);
%>
</body>
</html>