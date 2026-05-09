package com.tutoraca.firstProject.runner;

import com.tutoraca.firstProject.component.EmailService;
import com.tutoraca.firstProject.component.SmsService;
import com.tutoraca.firstProject.model.Course;
import com.tutoraca.firstProject.model.Trainer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BeanDemoRunner implements CommandLineRunner {

    private final EmailService emailService;
    private final SmsService smsService;
    private final Course course;
    private final Trainer trainer;

    public BeanDemoRunner(EmailService emailService, SmsService smsService, Course course, Trainer trainer) {
        this.emailService = emailService;
        this.smsService = smsService;
        this.course = course;
        this.trainer = trainer;
    }

    @Override
    public void run(String... args) {
        System.out.println("----- Spring Beans Demo -----");
        System.out.println("1. " + emailService.getServiceName());
        System.out.println("2. " + smsService.getServiceName());
        System.out.println("3. Course bean created using @Bean: " + course.getName());
        System.out.println("4. Trainer bean created using @Bean: " + trainer.getName());
    }
}
