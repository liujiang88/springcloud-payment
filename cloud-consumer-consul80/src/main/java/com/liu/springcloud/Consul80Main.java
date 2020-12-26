package com.liu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author 刘江
 * @create 2020/12/26 13:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Consul80Main {
    public static void main(String[] args) {
        SpringApplication.run(Consul80Main.class,args);
    }
}
