package com.gurpreet.spring.springcoreadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcoreadvanced/autowiring/config.xml");
		Employee e  = (Employee) ctx.getBean("employeebean");
		System.out.println(e);
	}

}
