package com.tutoraca.firstProject.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeUtil {

    public void employeeHelperMethod() {
        System.out.println("employee helper method called");
    }

    public void employeeHelperMethod(String str, int val) {
        System.out.println("employee helper method called");
    }

    public void employeeDaoHelperMethod(EmployeeDAO employeeDAO) {
        System.out.println("employee dao helper method called");
    }
}
