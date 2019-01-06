package com.zhh.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version v.1.0.0
 * @className: MemberApiFeign
 * @description: feign客户端  name 表示要调用的服务名
 * @author: yin.zhh
 * @date 2019-01-06 17:12
 */
@FeignClient(name = "yinzhh-member")
public interface MemberApiFeign {

    /**
     * @return java.lang.String
     * @author yin.zhh
     * @date: 2019/1/6 19:29
     * @description: 要调用的服务的方法
     */
    @RequestMapping("/getMember")
    String getmember();
}
