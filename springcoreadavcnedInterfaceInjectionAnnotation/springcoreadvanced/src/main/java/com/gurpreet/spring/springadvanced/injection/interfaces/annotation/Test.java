package com.gurpreet.spring.springadvanced.injection.interfaces.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springadvanced/injection/interfaces/annotation/config.xml");
		OrderBO bo = (OrderBO) ctx.getBean("bobean");
		bo.placeOrder();
	}
}
