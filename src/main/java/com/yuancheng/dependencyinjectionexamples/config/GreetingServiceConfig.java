package com.yuancheng.dependencyinjectionexamples.config;

import com.yuancheng.dependencyinjectionexamples.repositories.EnglishGreetingRepository;
import com.yuancheng.dependencyinjectionexamples.repositories.EnglishGreetingRepositoryImpl;
import com.yuancheng.dependencyinjectionexamples.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

  @Bean
  @Primary
  PrimaryInjectedGreetingService primaryInjectedGreetingService() {
    return new PrimaryInjectedGreetingService();
  }

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

  @Bean
  EnglishGreetingRepository englishGreetingRepository() {
    return new EnglishGreetingRepositoryImpl();
  }

  @Bean("i18nService")
  @Profile("EN")
  I18NEnglishGreetingService i18NEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
    return new I18NEnglishGreetingService(englishGreetingRepository);
  }
}
