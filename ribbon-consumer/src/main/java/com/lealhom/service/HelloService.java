package com.lealhom.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Lealhom on 2018/1/15 16:47
 * Description:
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello(){
        return restTemplate.getForObject("http://USER-SERVICE/hello",String.class);
    }

    public String helloFallback(){
        return "helloFallback";
    }
}
