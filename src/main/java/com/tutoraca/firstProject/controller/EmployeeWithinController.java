package com.tutoraca.firstProject.controller;

import com.tutoraca.firstProject.service.EmployeeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/within")
public class EmployeeWithinController {

    @Autowired
    private EmployeeUtil employeeUtil;

    @GetMapping("/fetchEmployee")
    public String fetchEmployee() {
        employeeUtil.employeeHelperMethod();
        return "within example";
    }
}
