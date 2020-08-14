package com.gurpreet.spring.springcore.constructorinjection;

public class Employee {
	private int id;
	private Address address;

	// Going to use the Constructor injection
	Employee(int id, Address address) {
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
