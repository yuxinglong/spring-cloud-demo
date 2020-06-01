package com.yucoding.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEurekaClientApplication.class,args);
    }
}
