package com.bienvx.crud_spring_boot_medium.crud_spring_boot.repository;

import com.bienvx.crud_spring_boot_medium.crud_spring_boot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
