package com.example.demo.dto;

/*
 * DTO (Data Transfer Object)
    -Used to transfer data between two layers
    -Prevents exposing internal implementation*/

public class EmployeeDTO {
	//Unique employee Identifier
	
	private Integer id;
	
	//Employee name
	
	private String name;
	
	//Employee Role/designation
	
	private String role;
	
	/*
	 * Default Constructor
	   -Used for JSON deserilization*/
	
	public EmployeeDTO() {
		
	}
	
	/*
	 * Parameterized Constructor
	    -Used to create employee Objects easily*/
	
	public EmployeeDTO(Integer id, String name, String role) {
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	
	// Getter & Setter Methods
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

}
