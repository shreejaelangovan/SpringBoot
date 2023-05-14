package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    public boolean addEmployee(Employee employee)
    {
        return employeeRepo.save(employee)!=null?true:false;
    }
    public List <Employee> getAllEmployees()
    {
        return employeeRepo.findAll();
    }
    public Employee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).get();
    }
    public List <Employee> getDesignationNotLike(String designation)
    {
        return employeeRepo.findDesignationNotLike(designation);
    }
    public List <Employee> getDesignationNameNotLike(String designation)
    {
        return employeeRepo.findDesignationNameNotLike(designation);
    }
}
