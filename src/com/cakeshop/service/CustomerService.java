package com.cakeshop.service;

import java.util.List;

import com.cakeshop.domain.Customer;

public interface CustomerService {

	public String saveCustomer(Customer customer);

	public Customer getCustomer(String customerId);

	public List<Customer> getCustomers();

}
