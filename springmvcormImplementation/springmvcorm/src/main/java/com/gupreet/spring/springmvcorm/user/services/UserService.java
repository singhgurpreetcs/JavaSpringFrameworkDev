package com.gupreet.spring.springmvcorm.user.services;

import java.util.List;

import com.gupreet.spring.springmvcorm.user.entity.User;

public interface UserService {
	int save(User user);
	List<User> getUsers();
}
