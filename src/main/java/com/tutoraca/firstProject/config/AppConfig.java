package com.tutoraca.firstProject.config;

import com.tutoraca.firstProject.model.Course;
import com.tutoraca.firstProject.model.Trainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course javaCourse() {
        return new Course("Spring Boot Basics");
    }

    @Bean
    public Trainer leadTrainer() {
        return new Trainer("Himanshu");
    }
}
