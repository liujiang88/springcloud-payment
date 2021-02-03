package com.liu.springalibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 刘江
 * @create 2021/1/5 12:02
 */
@RestController
@RefreshScope  //支持nacos动态刷新功能
public class ConfigClientController {
    @Value("${config.info}")
    private String serverPort;
    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Long id){
        return "nacos client"+id+"port:"+serverPort;}
}
