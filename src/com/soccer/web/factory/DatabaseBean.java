package com.soccer.web.factory;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import lombok.Data;

@Data
public class DatabaseBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String driver, url, username, password;
	private Connection conn;
	public DatabaseBean(String driver, String url, String username, String password) {
		this.driver = driver;
		this.username = username;
		this.password = password;
		this.url = url;
	}
	public Connection getConnection() {

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;		
	}
}

