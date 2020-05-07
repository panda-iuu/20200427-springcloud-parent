package com.aaa.lifuju.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName: 20200427-springcloud-parent
 * @Package: com.aaa.lifuju.springcloud
 * @ClassName: WebApplication7081
 * @Author: lifuju
 * @Description:
 * @Date: 2020/4/30 9:53
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class WebApplication7081 {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication7081.class, args);
    }

}
