package com.cakeshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	private static Connection con;

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		if (con == null) {
			Class.forName("org.h2.Driver");
			return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		}
		return con;
	}
}
