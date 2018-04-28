package com.cakeshop.dao;

import com.cakeshop.domain.Address;

public interface AddressDao {
	
	public String saveAddress(Address address);
	
	public Address getAddress(String custId);

}
