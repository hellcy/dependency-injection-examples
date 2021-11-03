package com.yuancheng.dependencyinjectionexamples.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("CN")
@Service("i18nService")
public class I18NChineseGreetingService implements GreetingService{
  @Override
  public String sayGreeting() {
    return "你好 世界 - 中文";
  }
}
