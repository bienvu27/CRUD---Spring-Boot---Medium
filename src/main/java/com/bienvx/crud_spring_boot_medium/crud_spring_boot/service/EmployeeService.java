package com.bienvx.crud_spring_boot_medium.crud_spring_boot.service;

import com.bienvx.crud_spring_boot_medium.crud_spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmloyee(Employee employee);

    List<Employee> fetchAllEmployees();

    Employee getEmployeeById(Long id);

    Employee updateEmployeeById(Long id, Employee employee);

    String deleteDepartmentById(Long id);
}
