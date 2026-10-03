package com.example.Employee_management_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "employee")
public class Employee {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name ="employee_id")
    private Integer employeeId;
    @Column (name = "employee_name")
    private String employeeName;
    @Column (name = "email")
    private String email;
    @Column(name = "username")
private String username;
    @Column (name = "password")
    private String password;
    @ManyToOne 
    @JoinColumn (name = "department_id")
    private Department department;
    @ManyToOne 
    @JoinColumn (name ="role_id")
    private Role role;

    public Employee(){
    }

    public Integer getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId){
        this.employeeId=employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public Role getRole(){
        return role;
    }

    public void setRole(Role role){
        this.role=role;
    }
    public Department getDepartment(){
        return department;
    }
    public void setDepartment(Department department){
        this.department = department;
    }
}
