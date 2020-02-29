package com.PMS.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	//测试
	@RequestMapping("/login")
	public String login() {
		return "test";
		
	}
}
