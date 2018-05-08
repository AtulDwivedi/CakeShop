package com.cakeshop.service;

public interface LoginService {
	
	public String checkLogin(String email, String password);

	int saveLogin(String email, String password);
	
	void changeStatus(String email, String status);
}
