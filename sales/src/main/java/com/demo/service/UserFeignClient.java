package com.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: ly
 * @date: 2019/5/10 10:24
 */
@FeignClient(name = "USER")
public interface UserFeignClient {
    @RequestMapping(value = "/user/getUserInfo", method = RequestMethod.GET)
    String getUserInfo();
}
