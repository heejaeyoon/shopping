<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
		<span id="zero"></span> <span id="tb"></span> <span id="tb2"></span> <input
			type="button" id="exe" value="사원정보" />
	</p>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script>
	
	/*fetch('content.jsp?empno=7900').then(res=>res.json()).then(function(data){
		$('#zero').html(data.ename+"<br/>"+data.sal+"<br/>"+data.job);
		//console.log(data.ename);
	});*/

	
function detail(empno) {
	fetch('content.jsp?empno='+empno).then(res=>res.json()).then(function(data){
		$('#tb2').html(data.ename+"<br/>"+data.sal+"<br/>"+data.job);
		//console.log(data.ename);
	});
	/*$.ajax({
		url : './content.jsp?empno='+empno,
		success : function(data) {
			$('#tb2').html(data);
		}
	})*/

	return false;
}

function order(v) {
	console.log(v);
	$.ajax({
		url : './list.jsp?order='+v,
		success : function(data) {
			$('#tb').html(data);

		}
	});
}

$('#exe').click(function() {
	$.ajax({
		url : './list.jsp',
		success : function(data) {
			$('#tb').html(data);

		}
	})
});
</script>
</body>
</html>