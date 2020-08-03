package com.gh.member;

import com.gh.member.feign.CouponFeginService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1\引入open-feign
 * 2\编写接口
 * 3\声明接口
 * 4\启动远程调用配置
 */

@EnableFeignClients(basePackageClasses = CouponFeginService.class)
@EnableDiscoveryClient
@SpringBootApplication
public class GhMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(GhMemberApplication.class, args);
    }

}
