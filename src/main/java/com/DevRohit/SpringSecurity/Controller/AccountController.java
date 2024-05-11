package com.DevRohit.SpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@GetMapping("/myAccount")
	public String getAccountDetails() {
		return "Here are my account details from db";
	}

}
