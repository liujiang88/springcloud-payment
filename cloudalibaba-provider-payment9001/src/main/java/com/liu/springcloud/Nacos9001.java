package com.liu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 刘江
 * @create 2021/1/4 17:26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Nacos9001 {
    public static void main(String[] args) {
        SpringApplication.run(Nacos9001.class, args);
    }
}
