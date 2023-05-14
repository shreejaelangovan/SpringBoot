package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.WeatherService;


@RestController
public class ApiController {
	@Autowired
	WeatherService service;
	 
	@GetMapping("/{cityName}")
	public String get(@PathVariable String cityName) {
		return service.getWeather(cityName);
	}
	

}