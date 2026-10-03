package com.example.Employee_management_system.entity;



import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GenerationType;


@Entity 
@Table (name = "leave_application")
public class LeaveApplication {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "leave_id")
    private Integer leaveId;
    @ManyToOne 
    @JoinColumn (name="employee_id")
    private Employee employee;
    @Column (name = "reason")
    private String reason;
    @Column (name = "start_date")
    private LocalDate startDate;
    @Column (name = "end_date")
    private LocalDate endDate;
    @Column (name = "status")
    private String status;

    public LeaveApplication(){
    }
    public Integer getLeaveId(){
        return leaveId;
    }
    public void setLeaveId(Integer leaveId){
        this.leaveId=leaveId;
    }
    public Employee getEmployee(){
        return employee;
    }
    public void setEmployee(Employee employee ){
        this.employee=employee;
    }
    public String getReason(){
        return reason;
    }
    public void setReason(String reason){
        this.reason=reason;
    }
    public LocalDate getStartDate(){
        return startDate;
    }
    public void setStartDate(LocalDate startDate){
        this.startDate=startDate;
    }
    public LocalDate getEndDate(){
        return endDate;
    }
    public void setEndDate(LocalDate endDate){
        this.endDate=endDate;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }

    
}
