<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="https://developers.kakao.com/sdk/js/kakao.min.js"></script>
<script>
	Kakao.init('490b24c14cba053c7a8956d1837ee10e'); //발급받은 키 중 javascript키를 사용해준다.
		console.log('**********************');
		console.log('스크립트가 실행이 되고있음.');
		console.log('**********************');
	if (Kakao.Auth.getAccessToken()) {
		console.log('**********************');
		console.log('if문 안에 들어왔음.');
		console.log('**********************');
		Kakao.API.request({
			url : '/v1/user/unlink',
			success : function(response) {
				console.log(response)
			},
			fail : function(error) {
				console.log(error)
			},
		})
		Kakao.Auth.setAccessToken(undefined)
	}
</script>
<%
	session.removeAttribute("userId");
	//response.sendRedirect("index.jsp");
%>
</body>
</html>