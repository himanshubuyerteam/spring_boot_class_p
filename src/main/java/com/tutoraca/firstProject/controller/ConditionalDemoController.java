package com.tutoraca.firstProject.controller;

import com.tutoraca.firstProject.component.ConditionalFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConditionalDemoController {

    @Autowired(required = false)
    private ConditionalFeatureService conditionalFeatureService;

    @GetMapping("/conditional-demo")
    public String showConditionalBean() {
        if (conditionalFeatureService != null) {
            return conditionalFeatureService.getMessage();
        }

        return "Conditional bean is NOT created because demo.feature.enabled=false";
    }
}
