package com.gurpreet.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gurpreet.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		
		//Creating an object
		Employee emp = new Employee();
		emp.setId(123);
		emp.setName("Test");
		modelAndView.addObject("employee", emp);
				
		return modelAndView;
	}
}
