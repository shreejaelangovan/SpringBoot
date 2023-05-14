package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    //  NOT LIKE
@Query(value="Select * from Employee where designation NOT LIKE ?1% ",nativeQuery=true)
public List <Employee> findDesignationNotLike(String designation);
//NOT CONTAIN
@Query(value="Select * from Employee where designation NOT LIKE %?1% ",nativeQuery=true)
public List <Employee> findDesignationNameNotLike(String designation);
}
