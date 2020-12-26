package com.liu.springcloud.controller;

import com.liu.springcloud.entities.CommonResult;
import com.liu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author 刘江
 * @create 2020/12/25 23:24
 */
@RestController
public class One {
  public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";
  @Resource
  private RestTemplate restTemplate;
  @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable Long id){
      return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
  }
}
