package com.test.spring;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class SleuthTraceApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(SleuthTraceApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate lb(){
        return new RestTemplate();
    }
}
