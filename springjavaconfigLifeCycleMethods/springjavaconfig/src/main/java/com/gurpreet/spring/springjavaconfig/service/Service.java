package com.gurpreet.spring.springjavaconfig.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.gurpreet.spring.springjavaconfig.Dao;

public class Service {

	@Autowired
	Dao dao;

	public void init()
	{
		System.out.println("init");
	}
	
	public void destroy()
	{
		System.out.println("destroy");
	}
	public void save()
	{
		dao.create();
	}
}
