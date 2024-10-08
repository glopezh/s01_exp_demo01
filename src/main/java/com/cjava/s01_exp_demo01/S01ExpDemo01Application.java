package com.cjava.s01_exp_demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class S01ExpDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(S01ExpDemo01Application.class, args);
    }

}
