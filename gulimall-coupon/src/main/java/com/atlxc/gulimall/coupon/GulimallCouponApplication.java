package com.atlxc.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、如何使用nacos作为配置中心统一管理配置
 * 1）、引入依赖
 * 2）、创建bootstrap.properties并配置
 * 3）、在配置中心添加一个数据集（data id）gulimall-coupon.properties（应用名.properties)
 * 4）、给应用名.properties 添加任何配置
 * 5）、动态获取配置 @RefreshScope；获取配置值 @Value("${配置项的名}")
 *
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
