package com.liu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Random;


/**
 * @Author 刘江
 * @create 2020/12/31 12:03
 */
@SpringBootApplication
//@EnableEurekaClient
//@EnableBinding(Source.class)
public class StreamRabbitmq8801 {
//    private static final Random RANDOM = new Random(System.currentTimeMillis());
//
//    private static final String[] data = new String[] {
//            "abc1", "def1", "qux1",
//            "abc2", "def2", "qux2",
//            "abc3", "def3", "qux3",
//            "abc4", "def4", "qux4",
//    };
    private static Object Integer;

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitmq8801.class,args);
//        new SpringApplicationBuilder(StreamRabbitmq8801.class)
//
//                .run(args);
    }
//    @InboundChannelAdapter(channel = Source.OUTPUT, poller = @Poller(fixedRate = "5000"))
//    public Message<?> generate() {
//        String value = data[RANDOM.nextInt(data.length)];
//        System.out.println("Sending: " + value);
//        return MessageBuilder.withPayload(value)
//                .setHeader("partitionKey", value)
//                .build();
//    }
}
