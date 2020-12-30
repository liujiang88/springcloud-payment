package com.liu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 刘江
 * @create 2020/12/29 20:48
 */
@RestController
@RefreshScope
public class ConfigClientController {
   @Value("${config.info}")
    private String configInfo;
   @GetMapping("/configInfo")
   public String getConfigInfo(){
       return configInfo;
   }
}
