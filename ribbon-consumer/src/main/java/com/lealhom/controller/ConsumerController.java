package com.lealhom.controller;

import com.lealhom.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lealhom on 2018/1/15 15:50
 * Description:
 */

@RestController
public class ConsumerController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/ribbon-consumer")
    public String helloConsumer(){
        return helloService.hello();
    }
}
