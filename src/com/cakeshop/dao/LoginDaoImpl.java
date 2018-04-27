package com.cakeshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDaoImpl implements LoginDao {

	@Override
	public boolean checkLogin(String email, String password) {
		// TODO Auto-generated method stub
		boolean status = false;
		String loginQuery = "select * from CS_LOGIN where email=? and password=? ";
		
		try(Connection con = DbUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(loginQuery)){
			
			//PreparedStatement ps= con.prepareStatement("select * from CS_LOGIN where email=? and password=? ");
			
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			
			ResultSet rs= pstmt.executeQuery();
			status= rs.next();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch block");
		}
		
		return status;
	}

}