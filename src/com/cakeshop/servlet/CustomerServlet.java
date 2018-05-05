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
import com.cakeshop.service.EmailServiceImpl;
import com.cakeshop.service.LoginService;
import com.cakeshop.service.LoginServiceImpl;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/customers/*")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CustomerService customerService;
	
	private LoginService loginService;

	public CustomerServlet() {
		super();
		customerService = new CustomerServiceImpl();
		loginService = new LoginServiceImpl();
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
			if(customerId != null) {
				// insert login record
				loginService.saveLogin(email, password);
			}
			
			// send mail
			Email myEmail = new Email();
			myEmail.setToAddress(email);
			myEmail.setSubject("Verification OTP");
			myEmail.setEmailContent("1234");
			(new EmailServiceImpl()).sentEmailOverSSL(myEmail);

		} else if (requestedUrl.contains("update")) {

		}
	}

}
