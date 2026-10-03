package com.example.Employee_management_system.repository;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Employee_management_system.entity.Role;

@SpringBootTest 
public class RoleRepositoryTest {
    @Autowired 
    private RoleRepository roleRepository;

    @Test 
    void saveRole(){
        Role role = new Role();
        role.setRoleName("EMPLOYEE");
        roleRepository.save(role);
        assertNotNull(role.getRoleId());
        Role foundRole = roleRepository.findById(role.getRoleId()).orElseThrow();
        assertNotNull(foundRole);
        assertEquals("EMPLOYEE", foundRole.getRoleName());
    }
    
}
