<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>1</div>
<div>
	<img id="soccer-intro" src="${img}/soccer-intro.jpg" alt=""/>
</div>
<div></div>
<div></div>
<div>
<form id="login_form">
	<div id="login_tab">
		<div id="login_tab_item1">
			USERID <input id="username" class="input_text" type="text" name="playerId"/>
		</div>
		<div id="login_tab_item2">
			<input type="hidden" name="action" value="login"/>
			<input type="hidden" name="page" value="main"/>
			<input id="login_btn" type="button" value="로그인"/>
		</div>
		<div id ="login_tab_item3">
			PASSWORD <input id="solar" class="input_text" type="text" name="solar">
		</div>
	</div>
</form>
</div>
<div></div>
<div></div>
<div>
	<h3 id="join_a"><a id="a_join"href="#">회원가입</a></h3>
</div>
<div></div>
<script>
app.init('${ctx}');
</script>
