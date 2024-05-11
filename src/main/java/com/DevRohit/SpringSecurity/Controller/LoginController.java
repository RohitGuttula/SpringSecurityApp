package com.DevRohit.SpringSecurity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DevRohit.SpringSecurity.Service.LoginService;
import com.DevRohit.SpringSecurity.model.Customer;

@RestController
public class LoginController {
	@Autowired
	LoginService loginService;
	@PostMapping("/register")
	public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer){
		Customer customerData=loginService.registerCustomer(customer);
		return new ResponseEntity<>(customerData,HttpStatus.CREATED);
	}

}
