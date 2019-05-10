package com.demo.controller;

import com.demo.util.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: ly
 * @date: 2019/5/10 10:23
 */
@Service
public class SalesService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    UserFeignClient userFeignClient;//调用user的接口，实例化feign

    private static final String RIBBON_URL = "http://user:8082/user/getUserInfo";
    private static final String IP = IpUtil.getIp();

    public String queryGoodsListByRibbon() {
        String sales_result = "queryGoodsListByRibbon success : [sales_ip:" + IP + "] ";
        String result = restTemplate.getForObject(RIBBON_URL, String.class);
        return sales_result + result;
    }

    public String queryGoodsListByFeign() {
        String sales_result = "queryGoodsListByFeign success : [sales_ip:" + IP + "] ";
        String result = (String) userFeignClient.getUserInfo();
        return sales_result + result;
    }
}