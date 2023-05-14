package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class ApiController {
 @Autowired
 EmployeeService employeeService; 
@PostMapping("/")
public boolean addEmployee(@RequestBody Employee employee)
{
   return employeeService.addEmployee(employee);
}
@GetMapping("/")
public List <Employee> getAllEmployees()
{
    return employeeService.getAllEmployees();
}
@GetMapping("/{id}")
public Employee getEmployeeById(@PathVariable int id)
{
    return employeeService.getEmployeeById(id);
}
//starts with
@GetMapping("/startsWith/{name}")
public List <Employee> getNameStartingwithletter(@PathVariable String name)
{
    return employeeService.getNameStartingwithletter(name);
}
//ends with
@GetMapping("/endsWith/{name}")
public List<Employee> getNameEndingwithLetter(@PathVariable String name)
{
    return employeeService.getNameEndingwithLetter(name);
}
//Contain
@GetMapping("/contain/{name}")
public List<Employee> getLetterContaining(@PathVariable String name)
{
    return employeeService.getLetterContaining(name);
}
//IsContaining
@GetMapping("/isContain/{name}")
public List<Employee> getNameContaining(@PathVariable String name)
{
    return employeeService.getNameContaining(name);
}
}
