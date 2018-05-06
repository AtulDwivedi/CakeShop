package com.cakeshop.dao;

public interface LoginDao{
	
	public String checkLogin(String email, String password);
	
	int saveLogin(String email, String password);
	
	void changeStatus(String email, String status);
}
