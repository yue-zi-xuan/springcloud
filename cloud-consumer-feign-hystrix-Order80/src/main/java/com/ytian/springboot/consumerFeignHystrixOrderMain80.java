package com.ytian.springboot;


import jdk.jfr.internal.tool.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class consumerFeignHystrixOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(consumerFeignHystrixOrderMain80.class,args);
    }
}
