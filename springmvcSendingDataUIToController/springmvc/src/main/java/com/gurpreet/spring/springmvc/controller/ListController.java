package com.gurpreet.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gurpreet.spring.springmvc.dto.Employee;

@Controller
public class ListController {
	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Test1");

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Test2");

		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("Test3");

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		modelAndView.addObject("employees", employees);
		return modelAndView;
	}
}
