package com.cakeshop.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cakeshop.domain.Customer;
import com.cakeshop.domain.Email;
import com.cakeshop.service.CustomerService;
import com.cakeshop.service.CustomerServiceImpl;
import com.cakeshop.service.EmailService;
import com.cakeshop.service.EmailServiceImpl;
import com.cakeshop.service.LoginService;
import com.cakeshop.service.LoginServiceImpl;
import com.cakeshop.service.VerificationService;
import com.cakeshop.service.VerificationServiceImpl;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/customers/*")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CustomerService customerService;

	private LoginService loginService;

	private EmailService emailService;

	private VerificationService verificationService;

	public CustomerServlet() {
		super();
		customerService = new CustomerServiceImpl();
		loginService = new LoginServiceImpl();
		emailService = new EmailServiceImpl();
		verificationService = new VerificationServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestedUrl = request.getRequestURI();

		if (requestedUrl.contains("save")) {

			// fetch the data
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String email = request.getParameter("email");
			String password = request.getParameter("password");

			// create customer object
			Customer customer = new Customer(firstName, lastName, email);

			// sned the obj to service for saving
			String customerId = customerService.saveCustomer(customer);
			if (customerId != null) {
				// insert login record
				loginService.saveLogin(email, password);
			}

			// send mail
			Email myEmail = new Email();
			myEmail.setToAddress(email);
			myEmail.setSubject("Verification OTP");
			String otp = getOtp();
			myEmail.setEmailContent(otp);
			emailService.sentEmailOverSSL(myEmail);
			verificationService.insertVerificationRecord(email, otp);

			request.setAttribute("msg", "Registered successfully, now verify yourself...");
			response.sendRedirect("../verification.jsp");
		} else if (requestedUrl.contains("update")) {

		}
	}

	private String getOtp() {
		return ((int)(Math.random() * 10000)) + "";
	}

}
