package com.cakeshop.constant;

public enum LoginStatus {

	ENABLED("Enabled"), DISABLED("Disabled"), BLOCKED("Bloaked");

	private final String status;

	LoginStatus(final String newStatus) {
		this.status = newStatus;
	}

	public String getLoginStatus() {
		return status;
	}
}
