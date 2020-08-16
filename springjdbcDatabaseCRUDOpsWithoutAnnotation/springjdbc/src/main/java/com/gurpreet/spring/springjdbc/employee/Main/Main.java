package com.gurpreet.spring.springjdbc.employee.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gurpreet.spring.springjdbc.employee.dao.EmployeeDao;
import com.gurpreet.spring.springjdbc.employee.dto.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gurpreet/spring/springjdbc/employee/Main/config.xml");
		EmployeeDao dao = (EmployeeDao) ctx.getBean("empDaoImplBean");
		Employee emp = new Employee();
		/*emp.setId(2);
		emp.setFirstName("Harjas");
		emp.setLastName("Kaur");
		emp.setId(3);
		emp.setFirstName("Amarjit");
		emp.setLastName("Kaur");*/
		emp.setId(1);
		emp.setFirstName("Gurpreet");
		emp.setLastName("Singhh");

		/*Insert, Update and Delete and SELECT Employee table*/
		//int lResult = dao.createEmployee(emp);
		//int lResult = dao.updateEmployee(emp);
		//int lResult = dao.deleteEmployee(1);
		Employee emp1 = dao.readEmployee(3);
		//System.out.println("Output: "+ lResult);
		System.out.println("Output: "+ emp1);
	}

}
