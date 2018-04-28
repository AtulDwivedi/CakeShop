package com.cakeshop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cakeshop.service.LoginService;
import com.cakeshop.service.LoginServiceImpl;


@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private LoginService loginservice;
    
    public LoginServlet() {
        super();
        this.loginservice = new LoginServiceImpl();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String em=request.getParameter("email");  
		String pass=request.getParameter("password");
		boolean stat = loginservice.checkLogin(em, pass);
		System.out.println(stat);
		if(stat){
			response.getWriter().print("You are succesfully login: " + em);
		}
		else{
			response.getWriter().print("Invalid Email id/ password");
		}
	}

}
