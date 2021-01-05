package com.liu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 刘江
 * @create 2021/1/4 18:16
 */
@RestController
public class PaymentController {
   @Value("${server.port}")
    private String serverPort;
   @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
       return "nacos registry"+id+"port:"+serverPort;
   }
}
