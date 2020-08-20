package com.gupreet.spring.springmvcorm.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gupreet.spring.springmvcorm.user.dao.UserDao;
import com.gupreet.spring.springmvcorm.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	//use Transacttional annotation at the service layer
	@Override
	@Transactional
	public int save(User user) {
		//create business logic as well
		int result = dao.createUser(user);
		return result;
	}

	@Override
	public List<User> getUsers() {
		List<User> users = dao.loadAllUsers();
		return users;
	}
}
