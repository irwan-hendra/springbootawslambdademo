package com.sevnis.springbootawslambdademo.service;

import com.sevnis.springbootawslambdademo.vo.DemoRequest;
import com.sevnis.springbootawslambdademo.vo.DemoResponse;
import org.springframework.stereotype.Service;

@Service
public class DemoService {


  public DemoResponse sayHello(DemoRequest demoRequest) {

    return DemoResponse.builder().key("hello").value("world").build();
  }
}
