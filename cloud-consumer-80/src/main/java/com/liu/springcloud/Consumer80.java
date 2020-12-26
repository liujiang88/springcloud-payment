package com.liu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author 刘江
 * @create 2020/12/25 18:17
 */
@EnableEurekaClient
@SpringBootApplication
public class Consumer80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80.class,args);
    }
}
