package com.aaa.lifuju.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: 20200427-springcloud-parent
 * @Package: com.aaa.lifuju.springcloud.config
 * @ClassName: RestConfig
 * @Author: lifuju
 * @Description:
 * @Date: 2020/4/28 9:38
 * @Version: 1.0
 */
@Configuration
public class RestConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
