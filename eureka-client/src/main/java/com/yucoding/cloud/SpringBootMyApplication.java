package com.yucoding.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootMyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMyApplication.class,args);
    }
}
