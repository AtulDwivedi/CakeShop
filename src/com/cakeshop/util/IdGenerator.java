package com.cakeshop.util;

public class IdGenerator {

	public static String getItemId() {
		return "ITM_" + System.currentTimeMillis();
	}
	
	public static String getAddressId() {
		return "ADD_" + System.currentTimeMillis();
	}
	
}


