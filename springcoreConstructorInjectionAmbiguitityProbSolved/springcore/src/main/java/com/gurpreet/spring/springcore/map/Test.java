package com.gurpreet.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcore/map/mapconfig.xml");
		Customer cust = (Customer) ctx.getBean("customer");

		System.out.println(cust);
	}
}
