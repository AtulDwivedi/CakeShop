package com.cakeshop.util;

public class IdGenerator {

	public static String getItemId() {
		return "ITM_" + System.currentTimeMillis();
	}
}
