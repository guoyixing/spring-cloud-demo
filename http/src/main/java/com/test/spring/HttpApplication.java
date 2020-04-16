package com.test.spring;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HttpApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(HttpApplication.class)
            .web(WebApplicationType.SERVLET)
            .run(args);
    }
}