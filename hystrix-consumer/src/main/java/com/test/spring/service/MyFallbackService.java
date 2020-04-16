package com.test.spring.service;

import com.test.spring.api.Iservice;
import com.test.spring.fallback.Fallback;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "test-http",fallback = Fallback.class)
public interface MyFallbackService extends Iservice {
}
