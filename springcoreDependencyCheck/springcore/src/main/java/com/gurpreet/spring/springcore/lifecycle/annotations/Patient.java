package com.gurpreet.spring.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
	@PostConstruct
	public void Hi() {
		System.out.println("Inside Hi method");
	}

	// will be used as an Destroy method
	@PreDestroy
	public void Bye() {
		System.out.println("Inside destroy method");
	}
}