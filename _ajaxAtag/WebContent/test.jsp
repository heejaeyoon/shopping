<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="javascript:alert('자바스크립트 실행!')"> alert </a><br/>
<a href="javascript:callFunction();"> callFunction </a><br/>
<a href="javascript:void(0)" onclick="callFunction();"> callFunction </a>
<script>
function callFunction() {
	console.log('callFunction');
}
</script>
</body>
</html>