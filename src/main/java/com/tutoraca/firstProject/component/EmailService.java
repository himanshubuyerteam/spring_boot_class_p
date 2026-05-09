package com.tutoraca.firstProject.component;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

    public String getServiceName() {
        return "EmailService bean created using @Component";
    }
}
