package com.gurpreet.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	//use the autowired annotations
	@Autowired
	private Address address;

	Employee(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
	public void setAddress(Address address) {
		this.address = address;
	}
}
