package com.gupreet.spring.springmvcorm.user.dao;

import java.util.List;

import com.gupreet.spring.springmvcorm.user.entity.User;

public interface UserDao {
	int createUser(User user);
	List<User> loadAllUsers();
	User loadUser(int id);
}
