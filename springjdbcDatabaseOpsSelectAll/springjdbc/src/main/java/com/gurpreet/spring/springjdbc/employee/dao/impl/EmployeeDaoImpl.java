package com.gurpreet.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gurpreet.spring.springjdbc.employee.dao.EmployeeDao;
import com.gurpreet.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.gurpreet.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int createEmployee(Employee emp) {
		String sqlInsert = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
		int lResult = jdbcTemplate.update(sqlInsert, emp.getId(), emp.getFirstName(), emp.getLastName());
		return lResult;
	}

	@Override
	public int updateEmployee(Employee emp) {
		String sqlUpdate = "UPDATE EMPLOYEE SET FIRSTNAME=?,LASTNAME=? WHERE ID=?";
		int lResult=jdbcTemplate.update(sqlUpdate, emp.getFirstName(),emp.getLastName(), emp.getId());
		return lResult;
	}

	@Override
	public int deleteEmployee(int id) {
		String sqlDelete = "DELETE FROM EMPLOYEE WHERE ID=?";
		int lResult=jdbcTemplate.update(sqlDelete, id);
		return lResult;
	}

	@Override
	public Employee readEmployee(int id) {
		String sqlSelect = "SELECT * FROM EMPLOYEE WHERE ID =?";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		Employee emp = jdbcTemplate.queryForObject(sqlSelect, rowmapper, id);
		return emp;
	}

	@Override
	public List<Employee> readEmployee() {
		String sqlSelectAll = "SELECT * FROM EMPLOYEE";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<Employee> res = jdbcTemplate.query(sqlSelectAll, rowmapper);
		return res;
	}
}
