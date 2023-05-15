package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FlightDetails {
    @Id
    private int id;
    private String name;
    private String flightNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	@Override
	public String toString() {
		return "FlightDetails [id=" + id + ", name=" + name + ", flightNumber=" + flightNumber + "]";
	}
    
}