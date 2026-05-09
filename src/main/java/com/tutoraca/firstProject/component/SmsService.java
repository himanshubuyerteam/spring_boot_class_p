package com.tutoraca.firstProject.component;

import org.springframework.stereotype.Component;

@Component
public class SmsService {

    public String getServiceName() {
        return "SmsService bean created using @Component";
    }
}
