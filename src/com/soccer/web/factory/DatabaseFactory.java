package com.soccer.web.factory;

import com.soccer.web.enums.DB;

public class DatabaseFactory {
	public static Database createDatabase(String vender) {
		Database db = null;
		switch(DB.valueOf(vender)) {
		case ORACLE : db = new Oracle(); break;
		case MARIADB : db = new Mariadb(); break;
		case MYSQL : break;
		}
		return db;
	}
}
