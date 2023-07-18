package com.indus.traning.dpsingleton;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class DBConnection {
	private static DBConnection conn =  null;
	/*private String userName;
	private String password;
	private String dbUrl;

	private DBConnection(String userName, String password, String dbUrl) {
		super();
		this.userName = userName;
		this.password = password;
		this.dbUrl = dbUrl;
	}*/
	private DBConnection() {
		super();
		System.out.println(this);
	}
	public static DBConnection getConn() {
		if (conn == null) {
		conn = new DBConnection();
		}
		return conn;
	}

}
