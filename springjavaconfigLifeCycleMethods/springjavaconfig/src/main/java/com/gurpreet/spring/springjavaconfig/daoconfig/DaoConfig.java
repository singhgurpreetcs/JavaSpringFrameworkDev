package com.gurpreet.spring.springjavaconfig.daoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gurpreet.spring.springjavaconfig.Dao;

@Configuration
public class DaoConfig {

	@Bean
	public Dao dao()
	{
		return new Dao();
	}
	
}
