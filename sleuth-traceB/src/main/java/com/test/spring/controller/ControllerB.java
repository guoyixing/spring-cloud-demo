package com.test.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class ControllerB {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/traceB")
    public String traceB(){
        log.info("--------Trace B");
        return "traceB";
    }
}
