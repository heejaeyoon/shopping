<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%!
	public int multiply(int a , int b){
	int c = a*b;
	return c;
}
%>
<%
	int sum = 0;
	for (int i = 1; i <= 10; i++){
		sum = sum + i;
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>1-10까지의 합</title>
</head>
<body>
10*25 = <%=multiply(10,25) %><br/>
1부터 10까지의 합은 <%= sum %> 입니다.

</body>
</html>