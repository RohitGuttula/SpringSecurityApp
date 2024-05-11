package com.DevRohit.SpringSecurity.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.DevRohit.SpringSecurity.model.Customer;
import com.DevRohit.SpringSecurity.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class EazyBankUsernamePwdAuthenticationProvider implements AuthenticationProvider {
    
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		String userName=authentication.getName();
		String pwd=authentication.getCredentials().toString();
		List<Customer> customer=customerRepository.findByEmail(userName);
		if(customer.size()>0) {
			log.info("password entered by the user: pwd={}",pwd);
			log.info("password from database",customer.get(0).getPwd());
			if(passwordEncoder.matches(pwd,customer.get(0).getPwd())) {
				log.info("password matches");
				List<GrantedAuthority> authorities=new ArrayList<>();
				authorities.add(new SimpleGrantedAuthority(customer.get(0).getRole()));
				return new UsernamePasswordAuthenticationToken(userName,pwd,authorities);
			}
			else {
				throw new BadCredentialsException("Invalid Password");
			}
		}
		throw new BadCredentialsException("User is not registered with the username");
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
