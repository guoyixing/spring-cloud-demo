package com.test.spring.controller;

import com.test.spring.api.Iservice;
import com.test.spring.service.MyFallbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private MyFallbackService myFallbackService;

    @GetMapping("/fallback")
    public String fallback() {
        return myFallbackService.error();
    }

    @GetMapping("/timeout")
    public String timeout(@RequestParam Integer time) {
        return myFallbackService.timeout(time);
    }

}