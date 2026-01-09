package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.Employee;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.EmployeeRepository;

/*
 * Service layer with DB integration
 */
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // CREATE
    public EmployeeDTO addEmployee(EmployeeDTO dto) {
        Employee employee = new Employee(null, dto.getName(), dto.getRole());
        Employee saved = employeeRepository.save(employee);
        return new EmployeeDTO(saved.getId(), saved.getName(), saved.getRole());
    }

    // READ ALL
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(emp -> new EmployeeDTO(emp.getId(), emp.getName(), emp.getRole()))
                .toList();
    }

    // READ BY ID
    public EmployeeDTO getEmployeeById(int id) {
        Employee emp = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));
        return new EmployeeDTO(emp.getId(), emp.getName(), emp.getRole());
    }

    // UPDATE
    public EmployeeDTO updateEmployee(int id, EmployeeDTO dto) {
        Employee emp = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));

        if (dto.getName() != null) emp.setName(dto.getName());
        if (dto.getRole() != null) emp.setRole(dto.getRole());

        Employee updated = employeeRepository.save(emp);
        return new EmployeeDTO(updated.getId(), updated.getName(), updated.getRole());
    }

    // DELETE
    public void deleteEmployee(int id) {
        Employee emp = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));
        employeeRepository.delete(emp);
    }
}