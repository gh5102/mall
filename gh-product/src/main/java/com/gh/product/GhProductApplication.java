package com.gh.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author guohao
 */
@EnableFeignClients(basePackages = "com.gh.product.feign")
@EnableDiscoveryClient
@MapperScan("com.gh.product.dao")
@SpringBootApplication

public class GhProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GhProductApplication.class, args);
    }

}
