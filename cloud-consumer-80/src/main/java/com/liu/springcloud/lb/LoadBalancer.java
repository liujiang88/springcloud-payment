package com.liu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author 刘江
 * @create 2020/12/26 17:40
 */
public interface LoadBalancer {
 public ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
