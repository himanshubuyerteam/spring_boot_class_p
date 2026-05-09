package com.tutoraca.firstProject.config;

import com.tutoraca.firstProject.model.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course javaCourse() {
        System.out.println("Java course bean created thorught Config");
        return new Course("Spring Boot Basics");
    }
}
