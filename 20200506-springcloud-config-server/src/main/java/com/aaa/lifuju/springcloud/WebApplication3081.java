package com.aaa.lifuju.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ProjectName: 20200427-springcloud-parent
 * @Package: com.aaa.lifuju.springcloud
 * @ClassName: WebApplication3081
 * @Author: lifuju
 * @Description:
 * @Date: 2020/5/7 11:12
 * @Version: 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class WebApplication3081 {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication3081.class,args);
    }
}
