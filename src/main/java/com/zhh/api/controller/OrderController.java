package com.zhh.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: OrderController
 * @Description: 订单服务，调用会员服务
 * @Author: yin.zhh
 * @Date 2018-12-23 15:45
 * @Version v.1.0.0
 */
@RestController
public class OrderController {

    private final RestTemplate restTemplate;

    private OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/getOrder")
    public String getorder() {
        /*点对点调用方式*/
        //String forObject1 = restTemplate.getForObject("http://localhost:8000/getMember", String.class);
        /*注册中心调用方式*/
        return restTemplate.getForObject("http://yinzhh-member/getMember", String.class);
    }
}
