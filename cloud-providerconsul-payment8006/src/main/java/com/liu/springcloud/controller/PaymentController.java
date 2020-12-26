package com.liu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 刘江
 * @create 2020/12/26 11:32
 */
@RestController
@Slf4j
public class PaymentController {
  @RequestMapping(value = "/consul/get")
    public String getOne(){
      return "123";
  }
}
