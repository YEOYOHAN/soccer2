<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../common/head.jsp"/>

<div></div>
<div></div>
<div></div>
<div></div>
<div>
<form id="join_form">
	<div id="join_tab">
		<div class="join_tab_iteam">
		TeamId <input class="join_input_text" type="text" name="teamId"/><br />
		PlayerId <input class="join_input_text" type="text" name="playerId"/><br />
		EngPlayerName <input class="join_input_text" type="text" name="e_PlayerName"/><br />
		JoinYear <input class="join_input_text" type="text" name="joinYyyy"/><br />
		Position <input class="join_input_text" type="text" name="position"/><br />
		BackNo <input class="join_input_text" type="text" name="backNo"/><br />
		Nation <input class="join_input_text" type="text" name="nation"/><br />
		BirthDate <input class="join_input_text" type="text" name="birthDate"/><br />
		Solar <input class="join_input_text" type="text" name="solar"/><br />
		Height <input class="join_input_text" type="text" name="height"/><br />
		Weight <input class="join_input_text" type="text" name="weight"/>
		</div>
	</div>
</form>
</div>
<div></div>
<div></div>
<div>
<h3 id="join_submit">
<a href="">가입완료</a>
<a id="back_page" href="#">뒤로가기</a>
</h3>
</div>
<div></div>
<script>
app.init('${ctx}');
</script>
<jsp:include page="../common/foot.jsp"/>