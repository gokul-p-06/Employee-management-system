package com.example.Employee_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee_management_system.entity.Department;

  public interface DepartmentRepository 
    extends JpaRepository<Department, Integer> {


}
