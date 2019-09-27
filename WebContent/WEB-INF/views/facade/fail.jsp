<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
로그인 실패
<a id = "btn" href="">로그인 재시도</a>
<script>
$('btn').click(function() {
	alert('이동')
	location.assign('<%=request.getContextPath()%>/player.do?action=move&page=index');
})
</script>
</body>
</html>