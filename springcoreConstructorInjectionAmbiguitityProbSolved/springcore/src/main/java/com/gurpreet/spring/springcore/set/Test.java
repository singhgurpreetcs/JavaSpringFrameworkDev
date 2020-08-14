package com.gurpreet.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springcore/set/setconfig.xml");
		CarDealer hospital = (CarDealer) ctx.getBean("cardealer");

		System.out.println("Name:" + hospital.getName());
		System.out.println("models:" + hospital.getModels());
		System.out.println(hospital.getModels().getClass().getName());
	}

}
