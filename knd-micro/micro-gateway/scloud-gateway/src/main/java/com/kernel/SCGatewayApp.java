package com.kernel;

import com.kernel.common.ribbon.annotation.EnableBaseFeignInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author knd
 * @date 2020/3/22
 */
@EnableFeignClients
@EnableBaseFeignInterceptor
@EnableDiscoveryClient
@SpringBootApplication
public class SCGatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(SCGatewayApp.class, args);
    }
}