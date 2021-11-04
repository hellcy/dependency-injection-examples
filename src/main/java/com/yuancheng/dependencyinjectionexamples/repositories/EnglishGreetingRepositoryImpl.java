package com.yuancheng.dependencyinjectionexamples.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
  @Override
  public String getGreeting() {
    return "Hello World! - English";
  }
}
