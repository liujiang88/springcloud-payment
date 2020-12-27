package com.liu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 刘江
 * @create 2020/12/27 10:38
 */
@Configuration
public class FeignConfig {
 @Bean
    Logger.Level feignLoggerLevel(){
     return Logger.Level.FULL;
 }
}
