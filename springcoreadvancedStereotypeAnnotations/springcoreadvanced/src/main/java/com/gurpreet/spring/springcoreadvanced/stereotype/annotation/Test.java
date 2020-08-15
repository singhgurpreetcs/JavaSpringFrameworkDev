package com.gurpreet.spring.springcoreadvanced.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcoreadvanced/stereotype/annotation/config.xml");
		// use instrutor in camel case because spring will create an object
		Instructor e = (Instructor) ctx.getBean("instructor");
		System.out.println(e);
	}

}
