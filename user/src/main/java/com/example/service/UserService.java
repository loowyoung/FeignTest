package com.example.service;

import com.example.util.IpUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author: ly
 * @date: 2019/5/10 10:57
 */
@Service("userService")
public class UserService {

    @Value("${server.port}")
    private Integer port;

    public String getUserInfo() {
        // 当前项目所在IP
        String ip = IpUtil.getIp();
        return "getUserInfo success : [user_ip:" + ip + "user_port:" + port + "] ";
    }

}