package com.cakeshop.dao;

import java.util.List;

import com.cakeshop.domain.Item;

public interface ItemDao {
	
	public String saveItem(Item item);

	public Item getItem(String itemId);

	public List<Item> getItems();
}
