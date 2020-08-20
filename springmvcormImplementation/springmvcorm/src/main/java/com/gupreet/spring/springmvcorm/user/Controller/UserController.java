package com.gupreet.spring.springmvcorm.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gupreet.spring.springmvcorm.user.entity.User;
import com.gupreet.spring.springmvcorm.user.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	
	@RequestMapping("registrationPage")
	public String showRegistrationPage() {
		System.out.println("Here");
		return "userRegistration";
	}
	
	@RequestMapping("getUsersPage")
	public String getUsers(ModelMap model) {
		List<User> users = service.getUsers();
		//key = users and value = users list
		model.addAttribute("users", users);
		return "displayUsers";
	}
	
	//registerUser must be as per jsp
	//implemented the controller method to save user to DB
	//Returing result on the model
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap map) {
		int result = service.save(user);
		map.addAttribute("result","User created with ID:" + result);
		return "userRegistration";
	}
}
