package com.cakeshop.service;

import com.cakeshop.dao.VerificationDao;
import com.cakeshop.dao.VerificationDaoImpl;

public class VerificationServiceImpl implements VerificationService {

	private VerificationDao verificationDao;
	
	public VerificationServiceImpl() {
		super();
		verificationDao = new VerificationDaoImpl();
	}
	
	@Override
	public boolean verify(String email, String otp) {
		return verificationDao.verify(email, otp);
	}

	@Override
	public void insertVerificationRecord(String email, String otp) {
		verificationDao.insertVerificationRecord(email, otp);		
	}

	@Override
	public void deleteVerificationRecord(String email) {
		verificationDao.deleteVerificationRecord(email);		
	}
}
