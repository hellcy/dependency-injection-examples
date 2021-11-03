package com.yuancheng.dependencyinjectionexamples.controllers;

import com.yuancheng.dependencyinjectionexamples.services.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

  ConstructorInjectedController constructorInjectedController;

  @BeforeEach
  void setUp() {
    constructorInjectedController = new ConstructorInjectedController(new PropertyInjectedGreetingService());
  }

  @Test
  void getGreeting() {
    System.out.println(constructorInjectedController.getGreeting());
  }
}