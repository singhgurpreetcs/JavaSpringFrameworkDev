package com.gurpreet.spring.springcoreadvanced.injection.interfaces;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside createOrder()");
	}

}
