package com.lealhom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lealhom on 2018/1/15 14:15
 * Description:
 */
@RestController
public class UserController {
//    @Autowired
//    ApplicationProperty applicationProperty;

    @Autowired
    private DiscoveryClient client;


    @RequestMapping("/hello")
    public String index(){
//        System.out.println(applicationProperty.getVersion());
//        System.out.println(applicationProperty.getDesc());
        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println("hello,host:"+instance.getHost()+",serviceId:"+instance.getServiceId());
        return "hello";
    }
    @RequestMapping("/hello1")
    String hello1(@RequestParam String name){
        return "hello " + name;
    }
    @RequestMapping("/hello2")
    String hello2(@RequestParam String name){
        return "hello " + name;
    }
}
