package com.gurpreet.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcore/properties/propertiesconfig.xml");
		StateAndLanguages test = (StateAndLanguages) ctx.getBean("stateAndLangs");

		System.out.println(test);
	}
}
