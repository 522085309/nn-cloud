package com.atxx.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author:XJ
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class TradeMain {
    public static void main(String[] args) {
        SpringApplication.run(TradeMain.class,args);
    }
}
