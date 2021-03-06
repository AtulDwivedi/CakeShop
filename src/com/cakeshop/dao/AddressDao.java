package com.cakeshop.dao;

import java.util.List;

import com.cakeshop.domain.Address;

public interface AddressDao {
	
	public String saveAddress(Address address);
	
	public Address getAddressById(String id);
	
	public List<Address> getAddressesByFk(String custId);
}
