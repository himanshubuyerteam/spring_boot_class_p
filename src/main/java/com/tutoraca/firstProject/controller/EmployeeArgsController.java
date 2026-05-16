package com.tutoraca.firstProject.controller;

import com.tutoraca.firstProject.service.EmployeeDAO;
import com.tutoraca.firstProject.service.EmployeeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/args")
public class EmployeeArgsController {

    @Autowired
    private EmployeeUtil employeeUtil;

    @GetMapping("/fetchEmployee")
    public String fetchEmployee() {
        employeeUtil.employeeHelperMethod("xyz", 123);
        return "item fetched";
    }

    @GetMapping("/fetchEmployeeDao")
    public String fetchEmployeeDao() {
        employeeUtil.employeeDaoHelperMethod(new EmployeeDAO());
        return "employee dao passed";
    }
}
