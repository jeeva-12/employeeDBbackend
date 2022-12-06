package com.example.employeedb_backend.controller;


import com.example.employeedb_backend.dao.EmployeeDao;
import com.example.employeedb_backend.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddEmployee(@RequestBody Employees e)

    {
        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getCompany().toString());
        System.out.println(e.getEmpcode());
        dao.save(e);
        return "Employee Added Successfully";
    }



}
