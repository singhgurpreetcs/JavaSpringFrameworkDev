package com.gurpreet.spring.springjdbc.employee.dao;

import com.gurpreet.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {
	int createEmployee(Employee emp);
	int updateEmployee(Employee emp);
	int deleteEmployee(int id);
	Employee readEmployee(int id);
}
