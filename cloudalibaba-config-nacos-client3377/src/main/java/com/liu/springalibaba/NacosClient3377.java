package com.liu.springalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 刘江
 * @create 2021/1/5 11:58
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosClient3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosClient3377.class,args);
    }
}
