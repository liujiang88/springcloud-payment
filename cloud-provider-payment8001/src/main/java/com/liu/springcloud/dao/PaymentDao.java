package com.liu.springcloud.dao;

import com.liu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 刘江
 * @create 2020/12/25 17:26
 */
@Mapper
public interface PaymentDao {
  public int create(Payment payment);
  public Payment getPayment(@Param("id") Long id);
}
