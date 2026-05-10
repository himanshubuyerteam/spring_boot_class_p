package com.tutoraca.firstProject.controller;

import com.tutoraca.firstProject.component.EmailService;
import com.tutoraca.firstProject.component.LifecycleDemoBean;
import com.tutoraca.firstProject.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanDemoController {

    private final EmailService emailService;
    private final Course course;
    private final LifecycleDemoBean lifecycleDemoBean;

    public BeanDemoController(
            EmailService emailService,
            Course course,
            LifecycleDemoBean lifecycleDemoBean
    ) {
        this.emailService = emailService;
        this.course = course;
        this.lifecycleDemoBean = lifecycleDemoBean;
    }

    @GetMapping("/demo")
    public String showBeans() {
        return """
                Bean Demo
                1. @Component bean: %s
                2. @Bean bean: %s
                3. Lifecycle bean status: %s
                """.formatted(
                emailService.getServiceName(),
                course.getName(),
                lifecycleDemoBean.getStatus()
        );
    }
}
