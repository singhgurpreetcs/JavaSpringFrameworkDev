package com.gurpreet.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");

		System.out.println("Name:" + hospital.getName());
		System.out.println("Name:" + hospital.getDepartments());
		System.out.println(hospital.getDepartments().getClass());
	}

}
