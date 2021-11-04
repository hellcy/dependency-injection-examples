package com.yuancheng.dependencyinjectionexamples.config;

import com.yuancheng.dependencyinjectionexamples.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

  @Bean
  ConstructorInjectedGreetingService constructorInjectedGreetingService() {
    return new ConstructorInjectedGreetingService();
  }

  @Bean
  PropertyInjectedGreetingService propertyInjectedGreetingService() {
    return new PropertyInjectedGreetingService();
  }

  @Bean
  SetterInjectedGreetingService setterInjectedGreetingService() {
    return new SetterInjectedGreetingService();
  }

  @Bean("i18nService")
  @Profile({"CN", "default"})
  I18NChineseGreetingService i18NChineseGreetingService() {
    return new I18NChineseGreetingService();
  }

  @Bean("i18nService")
  @Profile("EN")
  I18NEnglishGreetingService i18NEnglishGreetingService() {
    return new I18NEnglishGreetingService();
  }
}
