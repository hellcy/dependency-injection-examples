package com.yuancheng.dependencyinjectionexamples.controllers;

import com.yuancheng.pets.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
  private final PetService petService;

  public PetController(@Qualifier("petService") PetService petService) {
    this.petService = petService;
  }

  public String getPetService() {
    return petService.getPetType();
  }
}
