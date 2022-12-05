package com.example.employeedb_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String HomePage()
    {
        return "Welcome to HomePage";
    }


    @GetMapping("/add")
    public String AddPage()
    {
        return "Welcome to AddPage";
    }

    @GetMapping("/search")
    public String SearchPage()
    {
        return "Welcome to Search Page";
    }

    @GetMapping("/edit")
    public String EditPage()
    {
        return "Welcome to Edit Page";
    }


    @GetMapping("/viewall")
    public String ViewallPage()
    {
        return "Welcome to View all Page";
    }

}
