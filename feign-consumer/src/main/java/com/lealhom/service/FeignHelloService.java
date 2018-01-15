package com.lealhom.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Lealhom on 2018/1/15 16:47
 * Description:
 */
@FeignClient(name="USER-SERVICE" ,fallback = FeignHelloServiceHystrix.class) //user-service也行，不区分大小写
public interface FeignHelloService {
    @RequestMapping("/hello")
    String hello();
    @RequestMapping("/hello1")
    String hello1(@RequestParam(value = "name") String name);//这里必须加value，不然报错： QueryMap parameter must be a Map

}
