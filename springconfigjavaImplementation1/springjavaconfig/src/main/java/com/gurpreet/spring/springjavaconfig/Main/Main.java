package com.gurpreet.spring.springjavaconfig.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gurpreet.spring.springjavaconfig.Dao;
import com.gurpreet.spring.springjavaconfig.SpringConfig;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Dao daobean =  (Dao)ctx.getBean(Dao.class);
		
		daobean.create();
	}

}
