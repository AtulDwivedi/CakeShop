package com.cakeshop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cakeshop.constant.LoginStatus;
import com.cakeshop.service.LoginService;
import com.cakeshop.service.LoginServiceImpl;

@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LoginService loginservice;

	public LoginServlet() {
		super();
		this.loginservice = new LoginServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		String status = loginservice.checkLogin(email, pass);
		System.out.println(status);
		if (status.equals(LoginStatus.ENABLED.getLoginStatus())) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			request.getRequestDispatcher("profile.jsp").forward(request, response);
			;
		} else if (status.equals(LoginStatus.DISABLED.getLoginStatus())) {
			response.sendRedirect("verification.jsp");
		} else {
			request.setAttribute("loginMsg", "Incorrect details.");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
