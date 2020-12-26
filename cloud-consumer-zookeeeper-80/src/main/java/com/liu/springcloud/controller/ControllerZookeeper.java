package com.liu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author 刘江
 * @create 2020/12/26 9:54
 */
@RestController
public class ControllerZookeeper {
   public static  final String URL="http://cloud-provider-payment";
   @Resource
    private RestTemplate restTemplate;
   @GetMapping(value = "/payment/get")
   public String getinfo(){
       return restTemplate.getForObject(URL+"/payment/zk",String.class);
   }
}
