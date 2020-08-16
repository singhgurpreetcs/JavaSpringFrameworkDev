package com.gurpreet.spring.springjdbcassignment.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.gurpreet.spring.springjdbcassignment.dao.PassengerDao;
import com.gurpreet.spring.springjdbcassignment.dao.rowmapper.PassengerRowMapper;
import com.gurpreet.spring.springjdbcassignment.dto.Passenger;

@Component("passengerDaoImplBean")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int createPassenger(Passenger psg) {
		String sqlInsert = "INSERT INTO PASSENGER VALUES (?,?,?)";
		int lResult = jdbcTemplate.update(sqlInsert, psg.getId(), psg.getFirstName(), psg.getLastName());
		return lResult;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int updatePassenger(Passenger psg) {
		String sqlUpdate = "UPDATE PASSENGER SET FIRSTNAME=?,LASTNAME=? WHERE ID=?";
		int lResult = jdbcTemplate.update(sqlUpdate, psg.getFirstName(), psg.getLastName(), psg.getId());
		return lResult;
	}

	@Override
	public int deletePassenger(int id) {
		String sqlDelete = "DELETE FROM PASSENGER WHERE ID=?";
		int lResult = jdbcTemplate.update(sqlDelete, id);
		return lResult;
	}

	@Override
	public Passenger read(int id) {
		String sqlSelect = "SELECT * FROM PASSENGER WHERE ID=?";
		PassengerRowMapper rowmapper = new PassengerRowMapper();
		Passenger psg = jdbcTemplate.queryForObject(sqlSelect, rowmapper, id);
		return psg;
	}

	@Override
	public List<Passenger> read() {
		String sqlSelect = "SELECT * FROM PASSENGER";
		PassengerRowMapper rowmapper = new PassengerRowMapper();
		List<Passenger> psg = jdbcTemplate.query(sqlSelect, rowmapper);
		return psg;		
	}

}
