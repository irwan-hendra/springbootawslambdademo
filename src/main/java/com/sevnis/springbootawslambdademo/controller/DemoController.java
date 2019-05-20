package com.sevnis.springbootawslambdademo.controller;

import com.sevnis.springbootawslambdademo.service.DemoService;
import com.sevnis.springbootawslambdademo.vo.DemoRequest;
import com.sevnis.springbootawslambdademo.vo.DemoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @Autowired
  private DemoService demoService;

  @PostMapping("/helloworld")
  public DemoResponse sayHello(@RequestBody DemoRequest demoRequest) {

    return demoService.sayHello(demoRequest);
  }

}
