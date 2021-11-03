package com.yuancheng.dependencyinjectionexamples.controllers;

import com.yuancheng.dependencyinjectionexamples.services.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

  SetterInjectedController setterInjectedController;

  @BeforeEach
  void setUp() {
    setterInjectedController = new SetterInjectedController();
    setterInjectedController.setGreetingService(new PropertyInjectedGreetingService());
  }

  @Test
  void getGreeting() {
    System.out.println(setterInjectedController.getGreeting());
  }
}