package com.gurpreet.spring.springjdbcassignment.Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gurpreet.spring.springjdbcassignment.dao.PassengerDao;
import com.gurpreet.spring.springjdbcassignment.dto.Passenger;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springjdbcassignment/Main/config.xml");
		PassengerDao psgdao = (PassengerDao) ctx.getBean("passengerDaoImplBean");
		Passenger psg = new Passenger();

/*		psg.setId(1);
		psg.setFirstName("Gurpreet");
		psg.setLastName("Singh");

		psg.setId(2);
		psg.setFirstName("Harjas");
		psg.setLastName("Kaur");*/

		psg.setId(3);
		psg.setFirstName("Amarjitt");
		psg.setLastName("Kaur");

		// Creting the passenger or inserting to db
		//int lResult = psgdao.createPassenger(psg);
		
		//update
		//int lResult = psgdao.updatePassenger(psg);
		//delete
		//int lResult = psgdao.deletePassenger(1);
		//Passenger psg2 = psgdao.read(3);
		List<Passenger> psg2 = psgdao.read();
		System.out.println("Result: " + psg2);

	}

}
