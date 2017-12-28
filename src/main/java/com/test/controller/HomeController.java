package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.model.Student;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homePage() {
		return "index";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public @ResponseBody Student getSubmitted(@RequestBody Student student) {
		System.out.println("===== First name: " + student.getFirstName());
		System.out.println("===== Last name: " + student.getLastName());
		return student;
	}
	
}
