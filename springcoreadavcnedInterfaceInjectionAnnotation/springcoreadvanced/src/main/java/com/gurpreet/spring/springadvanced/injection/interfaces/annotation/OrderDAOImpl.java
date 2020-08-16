package com.gurpreet.spring.springadvanced.injection.interfaces.annotation;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside createOrder()");
	}

}
