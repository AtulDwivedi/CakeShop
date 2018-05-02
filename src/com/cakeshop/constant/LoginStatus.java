package com.cakeshop.constant;

public enum LoginStatus {

	ENABLED("Enabled"), DISABLED("Disabled"), BLOCKED("Bloaked");

	private final String loginStatus;

	LoginStatus(final String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getLoginStatus() {
		return loginStatus;
	}
}
