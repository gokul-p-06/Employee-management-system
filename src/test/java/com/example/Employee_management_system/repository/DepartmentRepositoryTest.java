package com.example.Employee_management_system.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Employee_management_system.entity.Department;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    void saveDepartment() {

        Department department = new Department();
        department.setDepartmentName("IT");

        Department savedDepartment = departmentRepository.save(department);

        assertNotNull(savedDepartment.getDepartmentId());

        Department foundDepartment =
                departmentRepository.findById(savedDepartment.getDepartmentId())
                        .orElseThrow();

        assertNotNull(foundDepartment);
        assertEquals("IT", foundDepartment.getDepartmentName());
    }
}