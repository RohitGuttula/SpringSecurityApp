package com.DevRohit.SpringSecurity.Exception;

import lombok.Data;

@Data
public class CustomerRegistrationFailedException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode="";
	public CustomerRegistrationFailedException(String message,String errorCode) {
		super(message);
		this.errorCode=errorCode;
		
	}

}
