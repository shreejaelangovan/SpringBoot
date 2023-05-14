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
    public List <Employee> getNameStartingwithletter(String name)
    {
        return employeeRepo.findBynamesStarttingwith(name);
    }
    public List <Employee> getNameEndingwithLetter(String name)
    {
        return employeeRepo.findByNamesEndingWith(name);
    }
    public List <Employee> getLetterContaining(String name)
    {
        return employeeRepo.findLetterContaining(name);
    }
    public List <Employee> getNameContaining(String name)
    {
        return employeeRepo.findNameContaining(name);
    }
}
