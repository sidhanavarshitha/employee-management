package com.example.demo.exception;

/*
 * Custom exception
 * Thrown when resource is not found*/
public class ResourceNotFoundException extends RuntimeException  {
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
