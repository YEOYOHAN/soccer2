<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 쿼리 -->
<h2>5. 팀아이디 키 이름 찾기</h2>
<form id="btn5" action="${ctx}/player.do">
	팀ID<input type="text" name="teamId"/><br />
	키<input type="text" name="height"/><br />
	이름<input type="text" name="player_name"/><br />
	<input type="hidden" name="action" value="find5"/>
	<input type="hidden" name="page" value="5_find_TeamId_Height_Name"/>
	<input type="submit" value="이동"/>
</form>
<!-- 결과 -->
해당 ID가 ${player.team_Id} 플레이어의 키 ${player.height} 플레이어의 이름 ${player.player_name}
입니다.