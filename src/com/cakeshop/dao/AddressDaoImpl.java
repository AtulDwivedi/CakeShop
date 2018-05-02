package com.cakeshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.cakeshop.domain.Address;
import com.cakeshop.util.IdGenerator;

public class AddressDaoImpl implements AddressDao {

	@Override
	public String saveAddress(Address address) {
		String id = null;
		String insertAddressQuery = "INSERT INTO CS_ADDRESS VALUES(?, ?, ?, ?, ?, ?, ?)";

		try (Connection con = DbUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(insertAddressQuery)) {

			String generatedId = IdGenerator.getAddressId();
			pstmt.setString(1, generatedId);
			pstmt.setString(2, address.getFlatNo());
			pstmt.setString(3, address.getArea());
			pstmt.setString(4, address.getLandMark());
			pstmt.setString(5, address.getCity());
			pstmt.setString(6, address.getState());
			pstmt.setString(7, address.getCountry());

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
	public Address getAddressById(String custId) {
		return null;
	}

	@Override
	public List<Address> getAddressbyFk(String custId) {
		return null;
	}

}
