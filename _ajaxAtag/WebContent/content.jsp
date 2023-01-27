<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num = Integer.parseInt(request.getParameter("empno"));
	EmpDao ed = EmpDao.getInstance();
	Emp emp = ed.select(num);
	//System.out.print(emp);
	out.print(emp);
%>




