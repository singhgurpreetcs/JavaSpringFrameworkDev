package com.gurpreet.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gurpreet/spring/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sqlInsert = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
		int lResult = jdbcTemplate.update(sqlInsert, new Integer(1), "Gurpreet", "Singh");
		System.out.println("Number of records inserted are: " + lResult);
	}

}
