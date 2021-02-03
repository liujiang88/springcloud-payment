package com.liu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 刘江
 * @create 2021/1/5 11:29
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
  public RestTemplate initRestTemplate(){
      return new RestTemplate();
  }
}
