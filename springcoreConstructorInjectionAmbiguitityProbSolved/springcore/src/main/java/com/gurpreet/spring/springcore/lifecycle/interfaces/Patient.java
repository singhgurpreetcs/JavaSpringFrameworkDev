package com.gurpreet.spring.springcore.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
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

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet()");
	}
}