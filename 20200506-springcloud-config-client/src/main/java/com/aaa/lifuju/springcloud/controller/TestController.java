package com.aaa.lifuju.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: 20200427-springcloud-parent
 * @Package: com.aaa.lifuju.springcloud.controller
 * @ClassName: TestController
 * @Author: lifuju
 * @Description:
 * @Date: 2020/5/7 15:12
 * @Version: 1.0
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String test(){

        return port+"11111";
    }
}
