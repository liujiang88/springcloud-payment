package com.liu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author 刘江
 * @create 2020/12/28 16:59
 */
@EnableHystrixDashboard
@SpringBootApplication
public class DashboardMain9011 {
    public static void main(String[] args) {
        SpringApplication.run(DashboardMain9011.class,args);
    }
}
