package com.yuancheng.dependencyinjectionexamples.controllers;

import com.yuancheng.dependencyinjectionexamples.services.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

  PropertyInjectedController propertyInjectedController;

  @BeforeEach
  void setUp() {
    propertyInjectedController = new PropertyInjectedController();
    propertyInjectedController.greetingService = new PropertyInjectedGreetingService();
  }

  @Test
  void getGreeting() {
    System.out.println(propertyInjectedController.getGreeting());
  }
}