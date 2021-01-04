package com.liu.springcloud.controller;

import com.liu.springcloud.service.IMessageProvider;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 刘江
 * @create 2020/12/31 12:42
 */
@RestController
public class SendMessageControllerInfo {
    @Resource
    private IMessageProvider iMessageProvider;
 @GetMapping(value = "/sendMessage")
 public String sendMessage(){
     return iMessageProvider.send();
 }
}
