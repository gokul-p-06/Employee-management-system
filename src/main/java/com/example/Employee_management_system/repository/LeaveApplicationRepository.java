package com.example.Employee_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee_management_system.entity.LeaveApplication;

public interface LeaveApplicationRepository 
    extends JpaRepository<LeaveApplication, Integer> {
    
}
