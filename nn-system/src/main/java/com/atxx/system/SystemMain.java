package com.atxx.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author:XJ
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.atxx.system.mapper")
public class SystemMain {
    public static void main(String[] args) {
        SpringApplication.run(SystemMain.class,args);
    }
}
