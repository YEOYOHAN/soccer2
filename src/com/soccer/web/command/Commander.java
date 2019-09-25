package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.enums.Action;

public class Commander {
	public static Command direct(HttpServletRequest request) {
		Command o = null;
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case SEARCH : o = new SearchCommand(); break;
		
		case MOVE : o = new MoveCommand(request); break;
		}
		return o;
		
	}

}
