package com.capgemini.service;



import com.capgemini.model.Address;

public interface IAddressService {
	public Address addAddress(Address address);
	public int deleteAddressById(int addressId);
	public Address updateAddress(Address add);
	public Address getAddressById(int id);

}
