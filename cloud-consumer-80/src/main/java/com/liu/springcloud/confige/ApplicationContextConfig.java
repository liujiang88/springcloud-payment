package com.liu.springcloud.confige;

import org.aspectj.lang.annotation.Before;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 刘江
 * @create 2020/12/25 23:24
 */
@Configuration
public class ApplicationContextConfig {
   @Bean
   @LoadBalanced
    public RestTemplate getRestTemplate(){
       return new RestTemplate();
   }
}
