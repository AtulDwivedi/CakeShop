package com.cakeshop.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cakeshop.constant.LoginStatus;
import com.cakeshop.service.LoginService;
import com.cakeshop.service.LoginServiceImpl;
import com.cakeshop.service.VerificationService;
import com.cakeshop.service.VerificationServiceImpl;

@WebServlet("/verify")
public class VerificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private VerificationService verificationService;

	private LoginService loginService;

	public VerificationServlet() {
		super();
		verificationService = new VerificationServiceImpl();
		loginService = new LoginServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String otp = request.getParameter("otp");
		if (verificationService.verify(email, otp)) {
			loginService.changeStatus(email, LoginStatus.ENABLED.getLoginStatus());
			verificationService.deleteVerificationRecord(email);
			response.sendRedirect("login.jsp");
		} else {
			response.sendRedirect("verification.jsp?msg=Incorrect+OTP");
		}
	}

}
