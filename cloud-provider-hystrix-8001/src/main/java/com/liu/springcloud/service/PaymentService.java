package com.liu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author 刘江
 * @create 2020/12/27 11:04
 */
@Service
@DefaultProperties(defaultFallback = "PaymentInfo_OneHandler")  //统一熔断
public class PaymentService {
    /**
     * 正常访问 ok
     * @param id
     * @return
     */
    @HystrixCommand  //统一熔断
 public String payment_OK(Long id){
        int i=10/0;
     return "线程池"+Thread.currentThread().getName()+"payment_OK:"+id+"hhh";
 }
   @HystrixCommand(fallbackMethod = "PaymentInfo_TimeOutHandler",commandProperties = {
           @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
   })
    public String payment_Timeout(Long id){
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"+Thread.currentThread().getName()+"payment_Timeout:"+id+"hhh";
    }
    public String PaymentInfo_TimeOutHandler(Long id){
     return "线程池"+Thread.currentThread().getName()+"系统繁忙请稍后在试  out";
    }
    public String PaymentInfo_OneHandler(){
        return "线程池"+Thread.currentThread().getName()+"系统统一错误  out";
    }
}
