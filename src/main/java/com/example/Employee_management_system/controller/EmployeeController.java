package com.example.Employee_management_system.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class EmployeeController {
    @GetMapping("/api/hello")
    public String hello(){
        return "Employee Management System Backend is running";
    }

}