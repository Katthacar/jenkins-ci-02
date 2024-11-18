package com.first.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello World with Rest and Spring-Boot";
  }

  @GetMapping("/hello2")
  public String hello2() {
    return "Hello World with Rest and Spring-Boot";
  }
  
  @GetMapping("/hello3")
  public String hello3() {
    return "Hello World with Rest and Spring-Boot";
  }

  @GetMapping("/hello4")
  public String hello4() {
    return "Hello World with Rest and Spring-Boot";
  }

  @GetMapping("/hello5")
  public String hello5() {
    return "Hello World with Rest and Spring-Boot";
  }

  @GetMapping("/hello6")
  public String hello6() {
    return "Hello World with Rest and Spring-Boot";
  }

}

