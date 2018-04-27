package com.cakeshop.service;

import java.util.Properties;

import com.cakeshop.domain.Email;
import com.jm2006.learn.javamail.send.InternetAddress;
import com.jm2006.learn.javamail.send.Message;
import com.jm2006.learn.javamail.send.MessagingException;
import com.jm2006.learn.javamail.send.MimeMessage;
import com.jm2006.learn.javamail.send.PasswordAuthentication;
import com.jm2006.learn.javamail.send.Session;

public class EmailServiceImpl implements EmailService {

	@Override
	public void sentEmailOverSSL(Email email) {
		
		public class SendMailThruSSL {

				String fromAddr = "atul.wnw@gmail.com";
				String toAddr = email.getEmail();
				String userName = "atul.wnw@gmail.com";
				String password = "#123";
				String subject = "Customer registration and selected items - SSL";
				String text = "Customer is registered. \n Items are added succesfully.";

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

		}

	}

	@Override
	public void sentEmailOverTLS(Email email) {
		// TODO Auto-generated method stub

	}

}
