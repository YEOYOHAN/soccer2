package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceImpls.PlayerServiceImpl;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request) {
		System.out.println("5. LoginCommand에 들어옴");
		System.out.println(String.format("request 값 출력: %s, %s, %s, %s", 
				request.getParameter("playerId"),
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
	@SuppressWarnings("unused")
	@Override
	public void execute() {
		String playerId = request.getParameter("playerId");
		String solar = request.getParameter("solar");
		PlayerBean player = new PlayerBean();
		player.setPlayerId(playerId);
		player.setSolar(solar);
		player = PlayerServiceImpl.getInstance().login(player);
		//System.out.println("10. DB에서 커맨더로 전달된 로그인 객체"+player.toString());
		setPage((player!=null)? request.getParameter("page"):"login");
		super.execute();
	}
}
