package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Donor;

@Repository
public interface DonorRepo extends JpaRepository<Donor, Integer>{
}

