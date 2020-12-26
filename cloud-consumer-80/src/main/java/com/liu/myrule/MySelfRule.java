package com.liu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author 刘江
 * @create 2020/12/26 16:23
 */
@Configuration
public class MySelfRule {
   @Bean
    public IRule myRule(){
       return new RandomRule();
   }
}
