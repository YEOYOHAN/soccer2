<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div id="wrapper" style="width: 100%; height: 100%">
	<form id="login_form" action="<%=request.getContextPath()%>/player.do">
		<table border="1" style="width:500px;height:200px; margin: 100px auto">
		<tr>
			<td style="width: 300px">
			USERID <input type="text" name="playerId" style="width: 100%"/>
			</td>
			<td rowspan="2">
			<input type="hidden" name="action" value="login"/>
			<input type="hidden" name="page" value="home"/>
			<input type="submit" value="로그인"/>
			</td>
		</tr>
		<tr>
			<td>
			PASSWORD <input type="text" name="solar" style="width: 100%">
			</td>
		</tr>
		<tr>
		
	</table>
	</form>
</div>
	<h3 style="width:300px; margin: 0 auto"><a id="a_join"href="">회원가입</a></h3>
<script>
$('#login_form').submit(function() {
	alert('페이지 이동')
})
</script>	
</body>
</html>