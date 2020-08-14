package com.gurpreet.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcore/dependencycheck/config.xml");
		
		Prescription p = (Prescription) ctx.getBean("prescriptionbean");

		System.out.println(p);
	}
}