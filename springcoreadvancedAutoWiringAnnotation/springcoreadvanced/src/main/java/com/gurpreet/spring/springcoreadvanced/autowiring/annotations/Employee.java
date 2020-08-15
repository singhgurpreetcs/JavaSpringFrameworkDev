package com.gurpreet.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
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
	
	//use the autowired annotations
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
}
