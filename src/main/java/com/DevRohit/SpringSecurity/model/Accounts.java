package com.DevRohit.SpringSecurity.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accounts {
	
	private int customerId;
	@Id
	private long accountNumber;
	
	private String accountType;
	
	private String branchAddress;
	
	private LocalDate createdDt;

}
