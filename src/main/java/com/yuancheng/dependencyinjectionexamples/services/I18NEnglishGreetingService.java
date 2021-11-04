package com.yuancheng.dependencyinjectionexamples.services;

import com.yuancheng.dependencyinjectionexamples.repositories.EnglishGreetingRepository;

public class I18NEnglishGreetingService implements GreetingService{

  private final EnglishGreetingRepository englishGreetingRepository;

  public I18NEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
    this.englishGreetingRepository = englishGreetingRepository;
  }

  @Override
  public String sayGreeting() {
    return englishGreetingRepository.getGreeting();
  }
}
