package com.cakeshop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cakeshop.domain.Address;
import com.cakeshop.domain.Item;
import com.cakeshop.service.AddressService;
import com.cakeshop.service.AddressServiceImpl;


@WebServlet("/addresses/*")
public class AddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AddressService addressService;
	
	public AddressServlet()
	{
		this.addressService =new AddressServiceImpl();
	}
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Address address = (Address) request.getAttribute("address");
		String addressId = addressService.saveAddress(address);
		response.getWriter().print("Address has been saved successfully. Address ID: " + addressId);
	}

}
