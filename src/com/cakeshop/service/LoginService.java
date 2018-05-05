package com.cakeshop.service;

public interface LoginService {
	
	public boolean checkLogin(String email, String password);

	int saveLogin(String email, String password);
}
