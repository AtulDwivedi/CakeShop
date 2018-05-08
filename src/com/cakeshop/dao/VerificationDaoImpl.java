package com.cakeshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VerificationDaoImpl implements VerificationDao {

	@Override
	public boolean verify(String email, String otp) {
		boolean isValidOtp = false;
		String query = "SELECT * FROM CS_VERIFICATION WHERE EMAIL = ? AND OTP = ?";
		try (Connection con = DbUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {
			pstmt.setString(1, email);
			pstmt.setString(2, otp);
			ResultSet rs = pstmt.executeQuery();
			isValidOtp = rs.next();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return isValidOtp;
	}

	@Override
	public void insertVerificationRecord(String email, String otp) {
		String query = "INSERT INTO CS_VERIFICATION VALUES(?, ?)";
		try (Connection con = DbUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {
			pstmt.setString(1, email);
			pstmt.setString(2, otp);
			pstmt.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteVerificationRecord(String email) {

		String query = "DELETE FROM CS_VERIFICATION WHERE EMAIL =?";
		try (Connection con = DbUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {
			pstmt.setString(1, email);
			pstmt.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
