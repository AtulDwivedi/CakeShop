package com.cakeshop.service;

public interface VerificationService {
	boolean verify(String email, String otp);

	void insertVerificationRecord(String email, String otp);

	void deleteVerificationRecord(String email);
}
