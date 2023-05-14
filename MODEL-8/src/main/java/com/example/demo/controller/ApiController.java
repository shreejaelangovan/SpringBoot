package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Donor;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
    @Autowired
    public ApiService apiService;
    @PostMapping("/")
    public boolean addDonor(@RequestBody Donor donor){
        return apiService.addDonor(donor);
    }
    @GetMapping("/{id}")
    public Donor getDonor(@PathVariable int id){
        return apiService.getDonorById(id);
    }
    @GetMapping("/")
    public List<Donor> getAllDonor(){
        return apiService.getDonor();
    }
    @PutMapping("/{id}")
    public Donor updateDonor(@RequestBody Donor donor, @PathVariable int id){
        return apiService.updateDonor(donor, id);
    }
    @DeleteMapping("/{id}")
    public boolean deleteOneDonor(@PathVariable int id){
        return apiService.deleteOneDonor(id); }
}
