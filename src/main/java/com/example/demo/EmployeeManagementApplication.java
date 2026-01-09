package com.example.demo;

import org.springframework.boot.SpringApplication;

/*@SpringBootApplication
 
 *-Enables Component-scanning
 
 *-Enables Auto-Configuration
 
 *-Marks this as Spring boot entry point
 *
 *(exclude = DataSourceAutoConfiguration.class)
 
    -Disables Database auto configuation
    -Prevents datasouce errors(since no db is used)

 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class EmployeeManagementApplication {
	
	/*
	 *main() method
	 *JVM execution starts from here
	 *BootStraps SpringBoot Application
	 *Starts Embedded Tomcat Server*/

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
