package com.cakeshop.dao;

public interface VerificationDao {
	boolean verify(String email, String otp);

	void insertVerificationRecord(String email, String otp);

	void deleteVerificationRecord(String email);
}
