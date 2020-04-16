package com.test.spring.service.Impl;

import com.test.spring.api.Iservice;
import org.springframework.stereotype.Service;

@Service
public class MyService implements Iservice {
    @Override
    public String error(){
        //添加一个报错，检查到报错就会调转到服务降级上去
//        int i = 1/0;
        return "MyService：这是正常的调用返回";
    }

    @Override
    public String timeout(Integer time) {
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "MyService：这是timeOut正常的调用返回";
    }
}