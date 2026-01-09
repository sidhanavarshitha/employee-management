##Employee-Management System

# Employee Management System

A Spring Boot backend application that provides REST APIs to manage employee details.
This project supports full CRUD operations and uses PostgreSQL as the database.

---

## Features

- Create employee details
- Get all employees
- Get employee by ID
- Update employee details
- Delete employee details
- PostgreSQL database integration
- RESTful API design
- Tested using Postman

---

## Tech Stack

- **Java**: 17  
- **Spring Boot**  
- **Spring Data JPA**  
- **PostgreSQL**  
- **Hibernate**  
- **Maven**  
- **Postman** (for API testing)  

---

## Project Structure

employee-management
│
├── controller # REST controllers
├── service # Business logic
├── repository # Database access layer
├── entity # JPA entities
├── dto # Data Transfer Objects
├── exception # Custom exceptions & handlers
└── EmployeeManagementApplication.java




---

## Database Configuration

PostgreSQL is used as the database.

Create a database:
```sql
CREATE DATABASE employee_db;

Updadte application.properties::
spring.datasource.url=jdbc:postgresql://localhost:5432/employee_db
spring.datasource.username=postgres
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

