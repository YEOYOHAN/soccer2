package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.enums.Action;

public class Commander {
	public static Command direct(HttpServletRequest request) {
		System.out.println("3. Commander.direct() 들어옴");
		System.out.println(String.format("request 값 출력: %s, %s, %s, %s", 
				request.getParameter("playerId"),
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		Command o = null;
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE : o = new MoveCommand(request); break;
		case LOGIN : o = new LoginCommand(request); break;
		default :
			break;
		}
		return o;
		
	}

}
