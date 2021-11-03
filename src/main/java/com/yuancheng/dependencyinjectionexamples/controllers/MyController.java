package com.yuancheng.dependencyinjectionexamples.controllers;

import com.yuancheng.dependencyinjectionexamples.services.GreetingService;
import com.yuancheng.dependencyinjectionexamples.services.PrimaryInjectedGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
