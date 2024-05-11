package com.DevRohit.SpringSecurity.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountTransactions {
	@Id
	private String transactionId;
	
	private long accountNumber;
	
	private int customerId;
	
	private Date transactionDt;
	
	private String transactionSummary;
	
	private String transactionType;
	
	private int transactionAmt;
	
	
	

}
