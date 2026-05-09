package com.tutoraca.firstProject.component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleDemoBean {

    private String status = "Bean object created";

    @PostConstruct
    public void init() {
        status = "@PostConstruct method executed";
        System.out.println("LifecycleDemoBean: @PostConstruct method executed");
    }

    @PreDestroy
    public void destroy() {
        status = "@PreDestroy method executed";
        System.out.println("LifecycleDemoBean: @PreDestroy method executed");
    }

    public String getStatus() {
        return status;
    }
}
