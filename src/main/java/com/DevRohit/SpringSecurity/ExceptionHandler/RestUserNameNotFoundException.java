package com.DevRohit.SpringSecurity.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.DevRohit.SpringSecurity.Exception.CustomerRegistrationFailedException;
import com.DevRohit.SpringSecurity.Exception.UserNameNotFoundException;

@ControllerAdvice
public class RestUserNameNotFoundException extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(UserNameNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleuserNameNotFoundException(UserNameNotFoundException e){
		new ErrorResponse();
		return new ResponseEntity<>(ErrorResponse.builder()
				                   .errorResponse(e.getMessage())
				                   .errorCode(e.getErrorCode()).build(),HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(CustomerRegistrationFailedException.class)
	public ResponseEntity<ErrorResponse> handleCustomerRegistrationFailedException
	                   (CustomerRegistrationFailedException e){
		return new ResponseEntity<>(ErrorResponse.builder()
				                     .errorResponse(e.getMessage())
				                     .errorCode(e.getErrorCode()).build(),HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
