package com.DevRohit.SpringSecurity.model;


import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy="native")
	private Long customerId;
	private String email;
	private String pwd;
	private String role;
    private String name;
    private String mobileNumber;
    private LocalDateTime createDt;
}
