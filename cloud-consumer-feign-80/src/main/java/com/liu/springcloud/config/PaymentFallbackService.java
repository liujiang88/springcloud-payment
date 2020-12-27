package com.liu.springcloud.config;

import com.liu.springcloud.entities.CommonResult;
import com.liu.springcloud.service.PaymentFeign;
import org.springframework.stereotype.Component;

/**
 * @Author 刘江
 * @create 2020/12/27 13:30
 */
@Component
public class PaymentFallbackService implements PaymentFeign {
    @Override
    public String get(Long id) {
        return "服务降级";
    }
}
