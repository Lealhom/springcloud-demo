package com.lealhom.controller;

import com.lealhom.service.FeignHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lealhom on 2018/1/15 15:50
 * Description:
 */

@RestController
public class FeignConsumerController {
    @Autowired
    FeignHelloService feignHelloService;

    @RequestMapping("/feign-consumer")
    public String helloConsumer(){
        return feignHelloService.hello();
    }
    @RequestMapping("/feign-consumer1")
    public String helloConsumer1(){
        return feignHelloService.hello1("良洪");
    }
}
