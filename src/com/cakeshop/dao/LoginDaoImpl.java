package com.cakeshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cakeshop.constant.LoginStatus;
import com.cakeshop.util.IdGenerator;

public class LoginDaoImpl implements LoginDao {

	@Override
	
			
	public String checkLogin(String email, String password) {
		String status = "Not Registered";
		String loginQuery = "select status from CS_LOGIN where email=? and password=?";

		try (Connection con = DbUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(loginQuery)) {
			pstmt.setString(1, email);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				status = rs.getString(1);
			}
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

	@Override
	public void changeStatus(String email, String status) {
		String insertItemQuery = "UPDATE CS_LOGIN SET STATUS = ? WHERE EMAIL = ?";

		try (Connection con = DbUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(insertItemQuery)) {

			pstmt.setString(1, status);
			pstmt.setString(2, email);

			pstmt.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}