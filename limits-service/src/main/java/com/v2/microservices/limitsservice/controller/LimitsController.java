package com.v2.microservices.limitsservice.controller;

import com.v2.microservices.limitsservice.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

  @GetMapping("/limits")
  public Limits getLimits(){
    return Limits.builder().minimum(1).maximum(1000).build();
  }
}
