package com.cakeshop.service;

import java.util.List;

import com.cakeshop.domain.Item;

public interface ItemService {

	public String saveItem(Item item);

	public Item getItem(String itemId);

	public List<Item> getItems();

}
