package com.liu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author 刘江
 * @create 2020/12/26 13:54
 */
@RestController
public class One {
    private static final String URL_CONSUL="http://localhost:8006";

    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consul/get/oo")
    public String getInfo(){
        return restTemplate.getForObject(URL_CONSUL+"/consul/get",String.class);
    }
}
