package com.lealhom.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Lealhom on 2018/1/15 17:12
 * Description:
 */
@Component //没有这个会 No fallback instance
public class FeignHelloServiceHystrix implements FeignHelloService {
    @Override
    public String hello() {
        return "FeignHelloServiceHystrix";
    }

    @Override
    public String hello1(@RequestParam String name) {
        return "fallback "+name;
    }
}
