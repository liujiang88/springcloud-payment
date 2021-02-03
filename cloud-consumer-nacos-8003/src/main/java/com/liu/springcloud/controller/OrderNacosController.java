package com.liu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author 刘江
 * @create 2021/1/5 11:21
 */
@RestController
@Slf4j
public class OrderNacosController {
    @Resource
  private RestTemplate restTemplate;
 @Value("${service-url.nacos-user-service}")
    private String serviceURL;
 @GetMapping(value = "payment/nacos/consumer/{id}")
 public String payment(@PathVariable("id") Long id){
     return restTemplate.getForObject(serviceURL+"/payment/nacos/"+id,String.class);
 }
}
