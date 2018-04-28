package com.cakeshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cakeshop.domain.Item;
import com.cakeshop.util.IdGenerator;

public class ItemDaoImpl implements ItemDao {

	@Override
	public String saveItem(Item item) {
		String id = null;
		String insertItemQuery = "INSERT INTO CS_ITEM VALUES(?, ?, ?, ?, ?)";

		try (Connection con = DbUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(insertItemQuery)) {

			String generatedId = IdGenerator.getItemId();
			pstmt.setString(1, generatedId);
			pstmt.setString(2, item.getName());
			pstmt.setString(3, item.getDescription());
			pstmt.setDouble(4, item.getPrice());
			pstmt.setInt(5, item.getQuantity());

			int recordInserted = pstmt.executeUpdate();

			if (recordInserted > 0) {
				id = generatedId;
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return id;
	}

	@Override
	public Item getItem(String itemId) {
		return null;
	}

	@Override
	public List<Item> getItems() {
		List<Item> items = new ArrayList<>();

		try (Connection con = DbUtil.getConnection(); Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT * FROM CS_ITEM");

			while (rs.next()) {
				Item item = new Item();

				item.setId(rs.getString(1));
				item.setName(rs.getString(2));
				item.setDescription(rs.getString(3));
				item.setPrice(rs.getDouble(4));
				item.setQuantity(rs.getInt(5));
				item.setCategory(rs.getString(6));
				item.setSubCategory(rs.getString(7));
				item.setImagePath(rs.getString(8));

				items.add(item);
			}

		} catch (SQLException | ClassNotFoundException e) {

		}

		return items;
	}

	@Override
	public Map<String, List<Item>> getItemsByCategory(String category) {
		Map<String, List<Item>> itemsByCategory = new HashMap<>();
		List<String> subCategories = getSubCategories(category);
		for (String subCategory : subCategories) {
			List<Item> itemsByCatAndSubCat = getItemsByCategoryAndSubCategory(category, subCategory);
			itemsByCategory.put(subCategory, itemsByCatAndSubCat);
		}
		return itemsByCategory;
	}

	@Override
	public List<Item> getItemsByCategoryAndSubCategory(String category, String subCategory) {
		List<Item> items = new ArrayList<>();
		try (Connection con = DbUtil.getConnection(); Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT * FROM CS_ITEM WHERE CATEGORY = '" + category
					+ "' AND SUB_CATEGORY = '" + subCategory + "'");

			while (rs.next()) {
				Item item = new Item();

				item.setId(rs.getString(1));
				item.setName(rs.getString(2));
				item.setDescription(rs.getString(3));
				item.setPrice(rs.getDouble(4));
				item.setQuantity(rs.getInt(5));
				item.setCategory(rs.getString(6));
				item.setSubCategory(rs.getString(7));
				item.setImagePath(rs.getString(8));

				items.add(item);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return items;
	}

	private List<String> getSubCategories(String category) {
		List<String> subCategories = new ArrayList<>();
		try (Connection con = DbUtil.getConnection(); Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT DISTINCT(SUB_CATEGORY) FROM CS_ITEM");
			while (rs.next()) {
				subCategories.add(rs.getString(1));
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return subCategories;
	}
}
