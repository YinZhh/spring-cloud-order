package com.zhh.api.controller;

import com.zhh.feign.MemberApiFeign;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v.1.0.0
 * @className: FeignMemberApiController
 * @description: feign controller
 * @author: yin.zhh
 * @date 2019-01-06 19:36
 */
@RestController
public class FeignMemberApiController {

    @Value("${server.port}")
    private String serverPort;

    private final MemberApiFeign memberApiFeign;

    public FeignMemberApiController(MemberApiFeign memberApiFeign) {
        this.memberApiFeign = memberApiFeign;
    }

    @RequestMapping("/getFeignMember")
    public String getmember() {
        String getmember = memberApiFeign.getmember();
        return "this is member，我是会员服务  端口号： " + serverPort + "  feign调用返回：" + getmember;
    }
}
