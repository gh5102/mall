package com.gh.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GhWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GhWareApplication.class, args);
    }

}
