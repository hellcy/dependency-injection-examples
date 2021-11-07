package com.yuancheng.dependencyinjectionexamples.config;

import com.yuancheng.dependencyinjectionexamples.datasources.FakeDatasource;
import com.yuancheng.dependencyinjectionexamples.repositories.EnglishGreetingRepository;
import com.yuancheng.dependencyinjectionexamples.repositories.EnglishGreetingRepositoryImpl;
import com.yuancheng.dependencyinjectionexamples.services.*;
import com.yuancheng.pets.CatPetService;
import com.yuancheng.pets.DogPetService;
import com.yuancheng.pets.PetService;
import com.yuancheng.pets.PetServiceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource("classpath:di-config.xml")
@PropertySource("classpath:datasource.properties")
public class GreetingServiceConfig {

  @Bean
  @Primary
  PrimaryInjectedGreetingService primaryInjectedGreetingService() {
    return new PrimaryInjectedGreetingService();
  }

  //@Bean
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

  @Bean
  PetServiceFactory petServiceFactory() {
    return new PetServiceFactory();
  }

  @Bean("petService")
  @Profile({"dog", "default"})
  PetService dogPetService(PetServiceFactory petServiceFactory) {
    return petServiceFactory.getPetService("dog");
  }

  @Bean("petService")
  @Profile("cat")
  PetService catPetService(PetServiceFactory petServiceFactory) {
    return petServiceFactory.getPetService("cat");
  }

  @Bean
  FakeDatasource fakeDatasource(@Value("${yuan.username}") String username,
                                @Value("${yuan.password}") String password,
                                @Value("${yuan.jdbcUrl}") String jdbcUrl) {
    FakeDatasource fakeDatasource = new FakeDatasource();
    fakeDatasource.setUsername(username);
    fakeDatasource.setPassword(password);
    fakeDatasource.setJdbcUrl(jdbcUrl);

    return fakeDatasource;
  }
}
