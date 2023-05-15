package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FlightDetails;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
 @Autowired
 ApiService service; 
@PostMapping("/")
public boolean addEmployee(@RequestBody FlightDetails flightdetails)
{
   return service.addFlight(flightdetails);
}
@GetMapping("/")
public List <FlightDetails> getAllFlights()
{
    return service.getAllFlights();
}
@GetMapping("/{id}")
public FlightDetails getFlightById(@PathVariable int id)
{
    return service.getFlightById(id);
}
}