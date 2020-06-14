package com.example.loginapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {
	
	@ResponseBody
	@RequestMapping("/home")
	public String Hello() {
		return "hello";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		//return "hello";
		return "welcomepage";
	}
	
	

}
