package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
 * @ControllerAdvice
 * -Handles Exceptions globally*/

@ControllerAdvice

public class GlobalExceptionHandler {
	
	/*Handles ResourceNotFoundException
	 * -Requests Http 404 */
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handlesResourcdeNotFound(ResourceNotFoundException ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	/*Handles all other exceptions
	 * Requests Http 500*/
	
//	@ExceptionHandler(Exception.class) 
//		public ResponseEntity<String> handlesResourceNotFoundException(Exception ex){
//			return new ResponseEntity<>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
//		}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleGenericException(Exception ex) {
	    return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	}


