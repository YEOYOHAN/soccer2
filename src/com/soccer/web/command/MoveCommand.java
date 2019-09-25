package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	
	public MoveCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}

}
