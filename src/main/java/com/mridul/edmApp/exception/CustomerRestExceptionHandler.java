package com.mridul.edmApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

	// exception handler for CustomerNotFoundException
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException exec) {
		CustomerErrorResponse error = new CustomerErrorResponse(HttpStatus.NOT_FOUND.value(), exec.getMessage(),
				System.currentTimeMillis());

		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}

	// Another exception handler .. to catch any exception

	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(Exception exec) {
		CustomerErrorResponse error = new CustomerErrorResponse(HttpStatus.BAD_REQUEST.value(), exec.getMessage(),
				System.currentTimeMillis());

		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}
	
	
}
