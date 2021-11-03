package com.yuancheng.dependencyinjectionexamples.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryInjectedGreetingService implements GreetingService{
  @Override
  public String sayGreeting() {
    return "Hello World! - Primary";
  }
}
