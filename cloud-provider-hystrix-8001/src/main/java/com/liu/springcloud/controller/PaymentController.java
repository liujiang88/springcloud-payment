package com.liu.springcloud.controller;

import com.liu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 刘江
 * @create 2020/12/27 11:08
 */
@RestController
@Slf4j
public class PaymentController {
 @Resource
    private PaymentService paymentService;
@GetMapping("/payment/hystrix/ok/{id}")
 public String paymentINFO_OK(@PathVariable("id") Long id){
     String s = paymentService.payment_OK(id);
     log.info("****{}",s);
     return s;
 }
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentINFO_TimeOut(@PathVariable("id") Long id){
        String s = paymentService.payment_Timeout(id);
        log.info("*****{}",s);
        return s;
    }
}
