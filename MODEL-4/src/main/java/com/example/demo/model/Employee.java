package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private long phoneNumber;
    private String address;
    private String email;
    private String jobtitle;
    private String department;
    private long salary;
    private String hiredate;
   public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
    public String getJobtitle() {
        return jobtitle;
    }
    public String getDepartment() {
        return department;
    }
    public long getSalary() {
        return salary;
    }
    public String getHiredate() {
        return hiredate;
    }
}
