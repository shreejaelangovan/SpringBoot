package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Donor {
    @Id
    int donorId;
    String name;
    int age;
    String address;
    String bloodGroup;
   public int getDonorId() {
        return donorId;
    }
    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getBloodGroup() {
        return bloodGroup;
    }
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public Donor(int donorId, String name, int age, String address, String bloodGroup) {
        this.donorId = donorId;
        this.name = name;
        this.age = age;
        this.address = address;
        this.bloodGroup = bloodGroup;
    }
    public Donor(){
    }
}

