package com.cakeshop.dao;

public interface LoginDao{
	
	public boolean checkLogin(String email, String password);
	
	int saveLogin(String email, String password);
}
