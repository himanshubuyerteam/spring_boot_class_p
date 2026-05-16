package com.tutoraca.firstProject.controller;

import com.tutoraca.firstProject.aspect.LogMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/annotation")
public class EmployeeAnnotationController {

    @LogMessage
    @GetMapping("/fetchEmployee")
    public String fetchEmployee() {
        return "annotation example";
    }
}
