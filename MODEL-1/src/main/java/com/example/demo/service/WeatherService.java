package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
	public String getWeather(String cityName) {
		String uri="https://api.openweathermap.org/data/2.5/weather?q="+cityName+"&appid=a1eb575e6a2a88ceb39f43230efe5756";
	RestTemplate restTemplate = new RestTemplate();
	System.out.print(restTemplate);
	String result = restTemplate.getForObject(uri, String.class); 
	return result;
	}
}