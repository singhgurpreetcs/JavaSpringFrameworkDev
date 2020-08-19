package com.gurpreet.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		System.out.println("Inside controller");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		
		//sending data from controller to UI
		modelAndView.addObject("id", 1234);
		modelAndView.addObject("Name", "Gurpreet Singh");
		
		return modelAndView;
	}
}