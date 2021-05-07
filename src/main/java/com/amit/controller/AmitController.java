package com.amit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class AmitController {

	@GetMapping("/hello")
	public String HelloSpringSecurity() {
		return "Welcome to Spring Security !";
	}

}
