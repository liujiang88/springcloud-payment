package com.liu.springcloud.controller;

import com.liu.springcloud.entities.CommonResult;
import com.liu.springcloud.entities.Payment;
import com.liu.springcloud.service.PaymentFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 刘江
 * @create 2020/12/27 1:25
 */
@RestController
@Slf4j
public class FeignController {
    @Resource
    private PaymentFeign paymentFeign;
    @GetMapping("/feign/getInfo/{id}")
    public String getInfo(@PathVariable("id") Integer id){
        return paymentFeign.get(Long.valueOf(id));
    }
    @GetMapping("/feign/breaker/{id}")
    public String breaker(@PathVariable("id") Integer id){
        return paymentFeign.get(Long.valueOf(id));
    }
}
