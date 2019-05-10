package com.example.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: ly
 * @date: 2019/5/10 10:56
 * <p>
 * 测试：http://127.0.0.1:8082/user/getUserInfo
 */
@RequestMapping("/user")
public interface UserRest {
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    String getUserInfo();
}
