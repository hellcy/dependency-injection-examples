package com.yuancheng.dependencyinjectionexamples.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
  public SingletonBean() {
    System.out.println("Creating a Singleton bean!");
  }

  public String getScope() {
    return "I am a Singleton";
  }
}
