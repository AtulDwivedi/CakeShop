package com.cakeshop.service;

import com.cakeshop.domain.Email;

public interface EmailService {

	public void sentEmailOverSSL(Email email);

	public void sentEmailOverTLS(Email email);

}
