package com.gurpreet.spring.springcore.constructorinjection.ambiguityproblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcore/constructorinjection/ambiguityproblem/config.xml");

		Addition addition = (Addition) ctx.getBean("additionbean");

		System.out.println(addition);
	}
}