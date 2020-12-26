package com.liu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 刘江
 * @create 2020/12/26 9:52
 */
@Configuration
public class ApplicationContextConfig {
   @Bean
   @LoadBalanced
    public RestTemplate getRestTemplate(){
       return new RestTemplate();
   }
}
