package com.gurpreet.spring.springcore.lifecycle.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Set method");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	// will be used as an init method
	public void Hi() {
		System.out.println("Inside Hi method");
	}

	// will be used as an Destroy method
	public void Bye() {
		System.out.println("Inside destroy method");
	}

}
