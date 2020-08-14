package com.gurpreet.spring.springcore.lifecycle.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcore/lifecycle/annotations/annotationsconfig.xml");
		
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcore/lifecycle/xmlconfig/lcconfig.xml");*/
		
		Patient p = (Patient) ctx.getBean("patientbean");

		System.out.println(p);
		
		// it tells the spring container to call the destroy method
		ctx.registerShutdownHook();
		
	}
}