package com.tutoraca.firstProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    // Exact method match
    @GetMapping("/fetchEmployee")
    public String fetchEmployee() {
        return "item fetched";
    }

    // First API with method name fetchEmployeeDetails
    @GetMapping("/fetchEmployeeDetails")
    public String fetchEmployeeDetails() {
        return "employee details fetched";
    }

    // Second API with same method name but different parameter list
    @GetMapping("/fetchEmployeeDetailsById")
    public String fetchEmployeeDetails(@RequestParam String id) {
        return "employee details fetched for id: " + id;
    }

    // Used for *(String) example
    @GetMapping("/findEmployee")
    public String findEmployee(@RequestParam String name) {
        return "employee found: " + name;
    }

    // Used for fetchEmployeeById(*) example
    @GetMapping("/fetchEmployeeById")
    public String fetchEmployeeById(@RequestParam String id) {
        return "employee id: " + id;
    }
}
