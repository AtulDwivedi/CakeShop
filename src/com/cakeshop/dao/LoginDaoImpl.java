package com.cakeshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cakeshop.constant.LoginStatus;
import com.cakeshop.util.IdGenerator;

public class LoginDaoImpl implements LoginDao {

	@Override
	public boolean checkLogin(String email, String password) {
		boolean status = false;
		String loginQuery = "select * from CS_LOGIN where email=? and password=? ";

		try (Connection con = DbUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(loginQuery)) {

			pstmt.setString(1, email);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();
			status = rs.next();

		} catch (Exception e) {
			System.out.println("catch block");
		}

		return status;
	}

	@Override
	public int saveLogin(String email, String password) {
		int recordInserted = 0;
		String insertItemQuery = "INSERT INTO CS_LOGIN VALUES(?, ?, ?)";

		try (Connection con = DbUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(insertItemQuery)) {

			pstmt.setString(1, email);
			pstmt.setString(2, password);
			pstmt.setString(3, LoginStatus.DISABLED.getLoginStatus());

			recordInserted = pstmt.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return recordInserted;
	}

}