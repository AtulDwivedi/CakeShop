package com.cakeshop.service;

import java.util.List;

import com.cakeshop.dao.CustomerDao;
import com.cakeshop.dao.CustomerDaoImpl;
import com.cakeshop.domain.Customer;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		super();
		customerDao = new CustomerDaoImpl();
	}
	
	@Override
	public String saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
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
