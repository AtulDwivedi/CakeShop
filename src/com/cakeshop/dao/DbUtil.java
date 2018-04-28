package com.cakeshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class DbUtil {

	private static Connection con;

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		if (con == null) {
			Class.forName("org.h2.Driver");

			ResourceBundle rb = ResourceBundle.getBundle("com//cakeshop//dao//db", Locale.US);
			String url = rb.getString("jdbcUrl");
			String un = rb.getString("userName");
			String pass = rb.getString("password");

			return DriverManager.getConnection(url, un, pass);
		}
		return con;
	}
}
