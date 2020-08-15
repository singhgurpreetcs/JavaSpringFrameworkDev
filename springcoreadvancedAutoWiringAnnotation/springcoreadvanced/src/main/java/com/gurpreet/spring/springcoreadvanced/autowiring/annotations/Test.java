package com.gurpreet.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcoreadvanced/autowiring/annotations/config.xml");
		Employee e  = (Employee) ctx.getBean("employeebean");
		System.out.println(e);
	}

}
