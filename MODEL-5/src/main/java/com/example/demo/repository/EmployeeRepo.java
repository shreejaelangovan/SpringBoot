package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    // STARTING WITH
@Query(value="Select * from Employee where name like ?1%",nativeQuery=true)    
public List <Employee> findBynamesStarttingwith(String name);
    // ENDING WITH 
@Query(value = "Select * from Employee where name like %?1", nativeQuery = true)
public List <Employee> findByNamesEndingWith(String name);
    // CONTAIN QUERY 
@Query(value = "Select * from Employee where name like %?1%", nativeQuery = true)
public List <Employee> findLetterContaining(String name);
    // ISCONTAINING QUERY 
@Query(value = "Select * from Employee where name like ?1", nativeQuery = true)
public List <Employee> findNameContaining(String name);
}
