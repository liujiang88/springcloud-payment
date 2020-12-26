package com.liu.springcloud.controller;

import com.liu.springcloud.entities.CommonResult;
import com.liu.springcloud.entities.Payment;
import com.liu.springcloud.service.PaymentService;
import com.liu.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 刘江
 * @create 2020/12/25 17:47
 */
@RestController
@Slf4j
public class PaymentController {
   @Resource
   PaymentService paymentService;
   @PostMapping(value = "/payment/create")
   public CommonResult create(Payment payment){
       int i = paymentService.create(payment);
       if (i>0){
           return new CommonResult(200,"成功");
       }else {
           return new CommonResult(500,"错误");
       }
   }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id){
        Payment payment = paymentService.getPayment(id);
        if (payment!=null){
            return new CommonResult(200,"成功00011",payment);
        }else {
            return new CommonResult(500,"错误");
        }
    }
}
