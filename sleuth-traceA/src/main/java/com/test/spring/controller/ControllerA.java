package com.test.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class ControllerA {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/traceA")
    public String traceA(){
        log.info("--------Trace A");
        return restTemplate.getForEntity("http://sleuth-traceB/traceB",String.class).getBody();
    }
}
