package com.gurpreet.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gurpreet/spring/springcore/propertyplaceholder/config.xml");
		DatabaseProperties db = (DatabaseProperties) ctx.getBean("databasepropbean");
		System.out.println(db);
	}

}
