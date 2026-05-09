package com.tutoraca.firstProject.component;

import org.springframework.stereotype.Component;

@Component
public class EmailService {


    EmailService()
    {
        System.out.println("Beans Creationg of Email Service");
    }
    public String getServiceName() {
        return "EmailService bean created using @Component";
    }
}
