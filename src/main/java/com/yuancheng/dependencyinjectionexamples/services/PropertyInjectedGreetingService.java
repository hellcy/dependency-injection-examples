package com.yuancheng.dependencyinjectionexamples.services;

public class PropertyInjectedGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World! - Property";
  }
}
