package com.yuancheng.dependencyinjectionexamples.config;

import com.yuancheng.dependencyinjectionexamples.services.ConstructorInjectedGreetingService;
import com.yuancheng.dependencyinjectionexamples.services.PropertyInjectedGreetingService;
import com.yuancheng.dependencyinjectionexamples.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
}
