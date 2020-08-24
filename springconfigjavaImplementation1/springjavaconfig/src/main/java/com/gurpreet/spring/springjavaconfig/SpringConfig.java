package com.gurpreet.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Java Configuration class
 * creates the objects
 * and we can then import them from container.
 */
@Configuration
public class SpringConfig {

	@Bean
	public Dao dao()
	{
		return new Dao();
	}
}
