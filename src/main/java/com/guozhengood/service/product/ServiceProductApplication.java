package com.guozhengood.service.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: swf
 * @Description:
 * @Date:Create：in 2020/2/19:20:30
 * @Modified By：
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProductApplication.class, args);
    }
}
