package com.test.spring.controller;

import com.test.spring.api.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    public Iservice iservice;

    @GetMapping("/error")
    public String error(){
        return iservice.error();
    }

    @GetMapping("/timeout")
    public String timeout(@RequestParam Integer time){
        return iservice.timeout(time);
    }
}
