package com.cakeshop.dao;

import java.util.List;

import com.cakeshop.domain.Customer;

public interface CustomerDao {

	public String saveCustomer(Customer customer);

	public Customer getCustomer(String customerId);

	public List<Customer> getCustomers();

}
