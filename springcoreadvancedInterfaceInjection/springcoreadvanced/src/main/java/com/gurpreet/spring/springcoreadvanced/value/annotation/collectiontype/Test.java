	package com.gurpreet.spring.springcoreadvanced.value.annotation.collectiontype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcoreadvanced/value/annotation/collectiontype/config.xml");
		// use instrutor in camel case because spring will create an object and read the bean from the container
		Instructor e = (Instructor) ctx.getBean("instructor");
		System.out.println(e);
		
		//object2
		Instructor e2 = (Instructor) ctx.getBean("instructor");
		System.out.println(e2);
	}

}
