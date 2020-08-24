package com.gurpreet.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.gurpreet.spring.springjavaconfig.daoconfig.DaoConfig;
import com.gurpreet.spring.springjavaconfig.service.Service;

/*
 * Java Configuration class
 * imports the DaoConfig bean and injects to service
 * and we can then import them from container.
 */
@Configuration
@Import(DaoConfig.class)
public class SpringConfig {

	@Bean
	public Service service()
	{
		return new Service();
	}
}
