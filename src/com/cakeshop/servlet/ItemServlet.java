package com.cakeshop.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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
		if (requestedUrl.contains("all")) {
			List<Item> items = itemService.getItems();
			request.setAttribute("items", items);
			request.getRequestDispatcher("/product-overview.jsp").forward(request, response);

		} else if (requestedUrl.contains("itm")) {
			Item item = itemService.getItem(request.getParameter("id"));
			request.setAttribute("item", item);
			request.getRequestDispatcher("/product-details.jsp").forward(request, response);
		} else if (requestedUrl.contains("byCat")) {
			String category = request.getParameter("category");
			Map<String, List<Item>> items = itemService.getItemsByCategory(category);
			request.setAttribute("itemsMap", items);
			request.getRequestDispatcher("/items-by-category.jsp").forward(request, response);
		} else if (requestedUrl.contains("bySubCat")) {
			String category = request.getParameter("category");
			String subCategory = request.getParameter("subCategory");
			List<Item> items = itemService.getItemsByCategoryAndSubCategory(category, subCategory);
			request.setAttribute("items", items);
			request.getRequestDispatcher("/items-by-sub-category.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Item item = (Item) request.getAttribute("item");
		String itemId = itemService.saveItem(item);
		response.getWriter().print("Item has been saved successfully. Item ID: " + itemId);
	}

}
