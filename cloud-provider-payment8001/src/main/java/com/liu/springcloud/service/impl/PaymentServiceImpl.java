package com.liu.springcloud.service.impl;

import com.liu.springcloud.dao.PaymentDao;
import com.liu.springcloud.entities.Payment;
import com.liu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author 刘江
 * @create 2020/12/25 17:46
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPayment(Long id) {
        return paymentDao.getPayment(id);
    }
}
