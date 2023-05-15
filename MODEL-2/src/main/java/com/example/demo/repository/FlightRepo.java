package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FlightDetails;

public interface FlightRepo extends JpaRepository<FlightDetails, Integer> {

}