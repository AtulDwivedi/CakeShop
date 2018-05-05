package com.cakeshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.cakeshop.domain.Customer;
import com.cakeshop.util.IdGenerator;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public String saveCustomer(Customer customer) {
		String id = null;
		String insertItemQuery = "INSERT INTO CS_CUSTOMER VALUES(?, ?, ?, ?)";

		try (Connection con = DbUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(insertItemQuery)) {

			String generatedId = IdGenerator.getCustomerId();
			pstmt.setString(1, generatedId);
			pstmt.setString(2, customer.getFirstName());
			pstmt.setString(3, customer.getLastName());
			pstmt.setString(4, customer.getEmail());

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
	public Customer getCustomer(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
