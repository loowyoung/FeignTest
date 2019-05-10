package com.example.service.impl;

import com.example.service.UserRest;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ly
 * @date: 2019/5/10 10:57
 */
@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    private UserService userService;

    @Override
    public String getUserInfo() {
        System.out.println("start to getUserInfo --->");
        return userService.getUserInfo();
    }
}
