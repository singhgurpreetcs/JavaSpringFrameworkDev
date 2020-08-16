package com.gurpreet.spring.springjdbcassignment.dao;

import java.util.List;

import com.gurpreet.spring.springjdbcassignment.dto.Passenger;

public interface PassengerDao {
	int createPassenger(Passenger psg);
	int updatePassenger(Passenger psg);
	int deletePassenger(int id);
	Passenger read(int id);
	List<Passenger> read();
}
