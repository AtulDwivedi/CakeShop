package com.cakeshop.service;

import com.cakeshop.dao.AddressDaoImpl;
import com.cakeshop.domain.Address;

public class AddressServiceImpl implements AddressService {
	
	private AddressDaoImpl AddressDao;

	public AddressServiceImpl()
	{
		this.AddressDao=new AddressDaoImpl();
	}

	@Override
	public String saveAddress(Address address) {
		return AddressDao.saveAddress(address);
	}

	@Override
	public Address getAddress(String customerId) {
		return null;
	}

}
