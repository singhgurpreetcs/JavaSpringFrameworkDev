package com.gurpreet.spring.springcoreadvanced.autowiring.annotations;

public class Address {
	private int houseNumber;
	private String street;

	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
}
