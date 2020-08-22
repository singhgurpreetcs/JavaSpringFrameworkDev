package com.gurpeet.spring.springaop.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gurpreet.spring.springaop.ProductService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gurpeet/spring/springaop/Main/config.xml");
				ProductService p = (ProductService) ctx.getBean("productService");
		
		int  x = p.multiply(4, 10);
		System.out.println("x ["+x+"]");
	}

}
