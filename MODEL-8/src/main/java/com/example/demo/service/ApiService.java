package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Donor;
import com.example.demo.repository.DonorRepo;

@Service
public class ApiService {
    @Autowired
    private DonorRepo donorRepo;
    public boolean addDonor(Donor donor){
        return donorRepo.save(donor) != null ? true : false;
    }
    public Donor getDonorById(int id){
        return donorRepo.findById(id).get();
    }
    public List <Donor> getDonor(){
        return donorRepo.findAll();
    }
    public Donor updateDonor(Donor donor, int id){
        Donor donor2 = donorRepo.findById(id).get();
        donor2.setName(donor.getName());
        donor2.setAge(donor.getAge());
        donor2.setAddress(donor.getAddress());
        donor2.setBloodGroup(donor.getBloodGroup());
        return donorRepo.save(donor2);
    }
    public boolean deleteOneDonor(int id){
       if(donorRepo.findById(id).isPresent()){
        donorRepo.deleteById(id);
        return true;
       }
       return false;
    }
}
