package com.DevRohit.SpringSecurity.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
	
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http)throws Exception {
//custom security configuration
		http
		.csrf().disable()
		.authorizeHttpRequests((requests)->
		       requests
		.requestMatchers("/myAccount","/myBalance","/myCards","/myLoans").authenticated()
		.requestMatchers("/myNotices","/myContacts","/register").permitAll()
		)
		.formLogin(Customizer.withDefaults())
		.httpBasic(Customizer.withDefaults());
		return http.build();
		
		
//configuration to deny all the requests
		/*http.authorizeHttpRequests((requests)->
		  requests
		      .anyRequest().denyAll())
		      .formLogin(Customizer.withDefaults())
		      .httpBasic(Customizer.withDefaults());
		   return http.build();*/
		
//configuration to permit all requests
		/*http.authorizeHttpRequests((requests)->
		  requests
		     .anyRequest().permitAll())
		     .formLogin(Customizer.withDefaults())
		     .httpBasic(Customizer.withDefaults());
		  return http.build();*/
		
		
	}

   /* @Bean
    InMemoryUserDetailsManager userDetailServce() {
        UserDetails admin = User.withUsername("admin")
                .password("12345")
                .authorities("admin")
                .build();
        UserDetails user = User.withUsername("User")
                .password("12345")
                .authorities("read")
                .build();

        return new InMemoryUserDetailsManager(admin, user);

    }*/
	/*@Bean
	public UserDetailsService userDetailsService(DataSource dataSource) {
		return new JdbcUserDetailsManager(dataSource);
	}*/
	@Bean
    public PasswordEncoder passwordEncoder() {
    	return new BCryptPasswordEncoder();
    }

}
