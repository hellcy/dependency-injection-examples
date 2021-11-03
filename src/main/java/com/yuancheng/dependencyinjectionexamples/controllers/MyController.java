package com.yuancheng.dependencyinjectionexamples.controllers;

import com.yuancheng.dependencyinjectionexamples.services.PrimaryInjectedGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final PrimaryInjectedGreetingService primaryInjectedGreetingService;

    public MyController(PrimaryInjectedGreetingService primaryInjectedGreetingService) {
        this.primaryInjectedGreetingService = primaryInjectedGreetingService;
    }

    public String sayHello() {
        return primaryInjectedGreetingService.sayGreeting();
    }
}
