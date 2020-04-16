package com.test.spring.fallback;

import com.test.spring.service.MyFallbackService;
import org.springframework.stereotype.Component;

@Component
public class Fallback implements MyFallbackService {
    @Override
    public String error(){
        return "Fallback：这是fallback的返回";
    }

    @Override
    public String timeout(Integer time) {
        return "Fallback：这是timeOut的返回";
    }
}