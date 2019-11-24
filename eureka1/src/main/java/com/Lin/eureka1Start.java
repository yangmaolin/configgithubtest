package com.Lin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eureka1Start {
    public static void main(String[] args){
        SpringApplication.run(eureka1Start.class,args);
    }
}
