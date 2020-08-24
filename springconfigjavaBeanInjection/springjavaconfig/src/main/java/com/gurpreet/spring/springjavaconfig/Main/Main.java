package com.gurpreet.spring.springjavaconfig.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gurpreet.spring.springjavaconfig.SpringConfig;
import com.gurpreet.spring.springjavaconfig.service.Service;

/*
 * Creates a Dao Bean
 * Autowires or Inject a Dao bean to Service Bean
 * Example:
 * Container starts.
 * it will go to config file
 * creates dao and service bean
 * creates dao bean and injects to service bean
 * get the service bean in test Main class
 * and get the results
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		//Dao daobean =  (Dao)ctx.getBean(Dao.class);
		
		Service s = (Service) ctx.getBean(Service.class);
		s.save();
	}

}
