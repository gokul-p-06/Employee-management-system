package com.example.Employee_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Employee_management_system.entity.Employee;

public interface EmployeeRepository 
extends JpaRepository<Employee, Integer>{
    
}
