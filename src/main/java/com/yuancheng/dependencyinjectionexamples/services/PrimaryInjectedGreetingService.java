package com.yuancheng.dependencyinjectionexamples.services;

public class PrimaryInjectedGreetingService implements GreetingService{
  @Override
  public String sayGreeting() {
    return "Hello World! - Primary";
  }
}
