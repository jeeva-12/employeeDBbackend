package com.example.employeedb_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employees {
    @Id
    @GeneratedValue
    private int id;
    private int empcode;
    private String name;
    private String designation;
    private int salary;
    private String company;
    private  String mobile;
    private String username;
    private String password;

    public Employees() {
    }

    public Employees(int id, int empcode, String name, String designation, int salary, String company, String mobile, String username, String password) {
        this.id = id;
        this.empcode = empcode;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.company = company;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
