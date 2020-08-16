package com.gurpreet.spring.springjdbcassignment.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gurpreet.spring.springjdbcassignment.dto.Passenger;

public class PassengerRowMapper implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger psg = new Passenger();
		psg.setId(rs.getInt(1));
		psg.setFirstName(rs.getString(2));
		psg.setLastName(rs.getString(3));
		return psg;
	}
}
