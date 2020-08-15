package com.gurpreet.spring.springcoreadvanced.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcoreadvanced/standalone/collection/config.xml");
		ProductList e  = (ProductList) ctx.getBean("productlistbean");
		System.out.println(e);
	}

}
