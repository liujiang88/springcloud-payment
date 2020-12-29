package com.liu.springcloud.controller;

import com.liu.springcloud.entities.CommonResult;
import com.liu.springcloud.entities.Payment;
import com.liu.springcloud.lb.LoadBalancer;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @Author 刘江
 * @create 2020/12/25 23:24
 */
@RestController
public class One {
  public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";
  @Resource
  private RestTemplate restTemplate;
  @Resource
  private DiscoveryClient discoveryClient;
  @Resource
  private LoadBalancer loadBalancer;
  @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable Long id){
      return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
  }
  @GetMapping(value = "/consumer/payment/{id}")
  public CommonResult getPayments(@PathVariable Long id){
    List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");  //获取可用服务器列表
    instances.forEach(System.out::println);
    if (instances==null || instances.size()<=0){
      return null;
    }
    ServiceInstance instances1 = loadBalancer.instances(instances);  //调用自定义负载均衡算法  获取相应的服务器信息
    URI uri = instances1.getUri();
    return restTemplate.getForObject(uri+"/payment/get/"+id,CommonResult.class);
  }
}
