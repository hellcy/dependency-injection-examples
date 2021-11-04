package com.yuancheng.dependencyinjectionexamples.services;

public class I18NChineseGreetingService implements GreetingService{
  @Override
  public String sayGreeting() {
    return "你好 世界 - 中文";
  }
}
