package com.liu.springcloud.service;

import com.liu.springcloud.config.PaymentFallbackService;
import com.liu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author 刘江
 * @create 2020/12/27 1:22
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE",fallback = PaymentFallbackService.class)
public interface PaymentFeign {
    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    public String get(@PathVariable("id") Long id);
}
