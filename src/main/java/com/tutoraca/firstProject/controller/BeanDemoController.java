package com.tutoraca.firstProject.controller;

import com.tutoraca.firstProject.component.EmailService;
import com.tutoraca.firstProject.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanDemoController {

    private final EmailService emailService;
    private final Course course;

    public BeanDemoController(EmailService emailService, Course course) {
        System.out.println("Bean of bean controller created");
        this.emailService = emailService;
        this.course = course;
    }

    @GetMapping("/demo")
    public String showBeans() {
        return """
                Bean Demo
                1. @Component bean: %s
                2. @Bean bean: %s
                """.formatted(emailService.getServiceName(), course.getName());
    }
}
