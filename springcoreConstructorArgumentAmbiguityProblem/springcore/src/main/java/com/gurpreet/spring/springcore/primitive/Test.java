package com.gurpreet.spring.springcore.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcore/primitive/primitivesconfig.xml");
		ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingcartbean");

		System.out.println(shoppingCart);
	}
}