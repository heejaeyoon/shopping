<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="mi" class="_jsp0118.MemberInfo" />
<jsp:setProperty property="*" name="mi" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:getProperty property="id" name="mi"/>
<jsp:getProperty property="password" name="mi"/>
<jsp:setProperty property="name" name="mi" />
<jsp:getProperty property="email" name="mi"/>
<jsp:getProperty property="registerDate" name="mi"/>

</body>
</html>