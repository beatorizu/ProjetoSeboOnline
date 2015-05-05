package br.com.farmacia.dao.util;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class ConnectionFactory {

	private final String URL = "jdbc:mysql://localhost/farmacia";
	private final String USER = "root";
	private final String PASS = "";

	public Connection createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return (Connection) DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
