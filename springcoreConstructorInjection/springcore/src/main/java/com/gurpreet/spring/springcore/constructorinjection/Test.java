package com.gurpreet.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcore/constructorinjection/config.xml");
		Employee e  = (Employee) ctx.getBean("employeebean");
		System.out.println(e);
	}

}
