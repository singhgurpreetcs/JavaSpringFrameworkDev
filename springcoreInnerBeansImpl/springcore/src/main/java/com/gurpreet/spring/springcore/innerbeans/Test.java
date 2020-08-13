package com.gurpreet.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcore/innerbeans/config.xml");

		Employee e = (Employee) ctx.getBean("empbean");

		System.out.println(e);
	}
}