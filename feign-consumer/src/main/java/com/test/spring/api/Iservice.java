package com.test.spring.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "test-http")
public interface Iservice {
    @GetMapping("/error")
    String error();

    @GetMapping("/timeout")
    String timeout(@RequestParam("time") Integer time);
}
