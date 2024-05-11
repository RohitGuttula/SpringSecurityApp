package com.DevRohit.SpringSecurity.Exception;

import lombok.Data;

@Data
public class UserNameNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode;
	public UserNameNotFoundException(String message, String errorCode) {
		super(message);
		this.errorCode=errorCode;
	}

}
