package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FlightDetails;
import com.example.demo.repository.FlightRepo;

@Service
public class ApiService {
    @Autowired
    FlightRepo repo;
    public boolean addFlight(FlightDetails flightdetails)
    {
        return repo.save(flightdetails)!=null?true:false;
    }
    public List <FlightDetails> getAllFlights()
    {
        return repo.findAll();
    }
    public FlightDetails getFlightById(int id)
    {
        return repo.findById(id).get();
    }
}