package com.cakeshop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cakeshop.domain.Item;
import com.cakeshop.service.ItemService;
import com.cakeshop.service.ItemServiceImpl;

@WebServlet("/items/*")
public class ItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ItemService itemService;

	public ItemServlet() {
		super();
		this.itemService = new ItemServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestedUrl = request.getRequestURI();
		
		if(requestedUrl.contains("all")) {
//			write the logic to fetch all items
			List<Item> items = itemService.getItems();
			request.setAttribute("items", items);
			request.getRequestDispatcher("/all-items.jsp").forward(request, response);
			
		}
		else if(requestedUrl.contains("itm")) {
			
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Item item = (Item) request.getAttribute("item");
		String itemId = itemService.saveItem(item);
		response.getWriter().print("Item has been saved successfully. Item ID: " + itemId);
	}

}
