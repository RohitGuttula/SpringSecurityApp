package com.DevRohit.SpringSecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.DevRohit.SpringSecurity.Exception.CustomerRegistrationFailedException;
import com.DevRohit.SpringSecurity.model.Customer;
import com.DevRohit.SpringSecurity.repository.CustomerRepository;

@Service
public class LoginService {
	
	@Autowired
	public CustomerRepository customerRepository;
	@Autowired
	public PasswordEncoder passwordEncoder;

	public Customer registerCustomer(Customer customer) {
		try {
		String hashPwd=passwordEncoder.encode(customer.getPwd());
		customer.setPwd(hashPwd);
		Customer savedCustomer=customerRepository.save(customer);	
		if(savedCustomer.getId()>0) {
			return savedCustomer;
		}
		else {
			throw new CustomerRegistrationFailedException("Customer registration failed","Internal Server Error");
		}
		}
		catch(Exception ex) {
			throw new RuntimeException("Error During registration", ex);
		}
	}

}
