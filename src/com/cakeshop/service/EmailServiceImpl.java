package com.cakeshop.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.cakeshop.domain.Email;

public class EmailServiceImpl implements EmailService {

	@Override
	public void sentEmailOverSSL(Email email) {

		String fromAddr = "karaninfo2018@gmail.com";
		String toAddr = email.getToAddress();
		String userName = "karaninfo2018@gmail.com";
		String password = "Sahai@#123";
		String subject = email.getSubject();
		String text = email.getEmailContent();

		Properties prop = new Properties();
		prop.put("mail.smtp.auth", true);
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "465");
		prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		prop.put("mail.smtp.socketFactory.port", "465");

		Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromAddr));
			message.setRecipients(RecipientType.TO, InternetAddress.parse(toAddr));
			message.setSubject(subject);
			message.setText(text);

			Transport.send(message);
			System.out.println("Sent!");
		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void sentEmailOverTLS(Email email) {

	}

}
