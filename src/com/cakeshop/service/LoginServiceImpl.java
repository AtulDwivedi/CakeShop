package com.cakeshop.service;

import com.cakeshop.dao.LoginDao;
import com.cakeshop.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	
	private LoginDao logindao;
	
	public LoginServiceImpl(){
		
		this.logindao = new LoginDaoImpl();
	System.out.println("Service Layer");
	}

	@Override
	public boolean checkLogin(String email, String password) {
				return logindao.checkLogin(email, password);
		
	}

	@Override
	public int saveLogin(String email, String password) {
		return logindao.saveLogin(email, password);
	}

}
