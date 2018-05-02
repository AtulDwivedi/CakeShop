package com.cakeshop.service;

import com.cakeshop.domain.Address;

public interface AddressService {
	
	public String saveAddress(Address address);
	
	public Address getAddress(String customerId);

}
