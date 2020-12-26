package com.liu.springcloud.service;

import com.liu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 刘江
 * @create 2020/12/25 17:45
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPayment(Long id);
}
