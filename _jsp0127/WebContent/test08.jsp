<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="test.Member"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
    <%
    List<Member> mlst = Arrays.asList(
    		new Member("홍",20),
    		new Member("이",54),
    		new Member("유",19),
    		new Member("왕",42)
    		);
    request.setAttribute("members", mlst);
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${members.stream().sorted((m1,m2)->m1.age.compareTo(m2.age))
.map(x->x.name += x.age).toList() }<br>
${members.stream().count() }<br>
${vals=["하","가","카"];
	sorted=vals.stream().sorted((x1,x2) -> x1 < x2? 1:-1).toList() }
	
</body>
</html>