package com.DevRohit.SpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
	
	@GetMapping("/myLoans")
	public String myloanDetails() {
		return "here are the Loans details from DB";
	}

}
