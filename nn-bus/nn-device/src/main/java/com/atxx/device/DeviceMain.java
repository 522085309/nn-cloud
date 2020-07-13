package com.atxx.device;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author:XJ
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DeviceMain {
    public static void main(String[] args) {
        SpringApplication.run(DeviceMain.class,args);
    }
}
