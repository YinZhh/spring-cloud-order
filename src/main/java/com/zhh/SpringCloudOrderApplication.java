package com.zhh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @version v.1.0.0
 * @className: FeignMemberApiController
 * @description: spring boot启动类   @EnableFeignClients 开启Feign功能权限
 * @author: yin.zhh
 * @date 2019-01-06 19:36
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOrderApplication.class, args);
    }

    /**
     * @Author yin.zhh
     * @Date: 2018-12-23 16:21
     * @Description: @LoadBalanced 注解表示 ribbon负债均衡器 RestTemplate在请求时拥有客户端负债均衡能力
     * 支持服务别名方式调用
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}

