package com.connectify.connectifybackend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloWorld {
  
  @GetMapping("/public/hello")
  public ResponseEntity<String> hello(){
    return ResponseEntity.ok("hello world!");
  }

  @GetMapping("/private/hello")
  public ResponseEntity<String> helloPrivated(){
    return ResponseEntity.ok("hello world!");
  }
}
