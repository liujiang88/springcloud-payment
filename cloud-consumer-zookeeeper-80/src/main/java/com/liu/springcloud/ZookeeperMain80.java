package com.liu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 刘江
 * @create 2020/12/26 9:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperMain80.class,args);
    }
}
