package com.gurpreet.spring.springadvanced.injection.interfaces.annotation;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("OrderDAOImpl2 createOrder()");
	}

}
