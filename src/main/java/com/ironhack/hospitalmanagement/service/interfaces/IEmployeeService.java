package com.ironhack.hospitalmanagement.service.interfaces;

import  com.ironhack.hospitalmanagement.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(Long id);
    List<Employee> getEmployeeByStatus(String status);

    List<Employee> getEmployeesByDepartment(String department);
}
