package com.DevRohit.SpringSecurity.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeConroller {
	@GetMapping("/welcome")
	public String welcomemethd() {
		return "Hello rohit welcome to spring application with security";
	}

}
