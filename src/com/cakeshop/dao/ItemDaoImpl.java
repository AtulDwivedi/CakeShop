package com.cakeshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

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
		return null;
	}

}
