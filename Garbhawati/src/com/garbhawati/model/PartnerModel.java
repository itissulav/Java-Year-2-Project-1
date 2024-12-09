/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.garbhawati.model;

/**
 *
 * @author itiss
 */
public class PartnerModel {
    String Id;
    String Name;
    String Religion;
    short Age;
    String Height;
    String Job;
    Integer Salary;
    String Gender;

    public PartnerModel() {
    }

    public PartnerModel(String ID, String Name, String Religion, short Age, String Height, String Job, Integer Salary, String Gender) {
        this.Id = ID;
        this.Name = Name;
        this.Religion = Religion;
        this.Age = Age;
        this.Height = Height;
        this.Job = Job;
        this.Salary = Salary;
        this.Gender = Gender;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getReligion() {
        return Religion;
    }

    public void setReligion(String Religion) {
        this.Religion = Religion;
    }

    public short getAge() {
        return Age;
    }

    public void setAge(short Age) {
        this.Age = Age;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer Salary) {
        this.Salary = Salary;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    
}
