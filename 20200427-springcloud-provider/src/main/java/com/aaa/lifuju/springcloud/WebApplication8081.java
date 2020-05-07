package com.aaa.lifuju.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: 20200427-springcloud-parent
 * @Package: com.aaa.lifuju.springcloud
 * @ClassName: WebApplication8081
 * @Author: lifuju
 * @Description: 启动类
 * @Date: 2020/4/28 9:28
 * @Version: 1.0
 */
@SpringBootApplication
@MapperScan("com.aaa.lifuju.springcloud.mapper")
@EnableDiscoveryClient
public class WebApplication8081 {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication8081.class, args);
    }
}
