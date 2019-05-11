package com.demo.service;

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

    /**
     * 　在微服务都是以HTTP接口的形式暴露自身服务的，因此在调用远程服务时就必须使用HTTP客户端。
     * 我们可以使用JDK原生的URLConnection、Apache的Http Client、Netty的异步HTTP Client, Spring的RestTemplate
     */
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    UserFeignClient userFeignClient;//调用user的接口，实例化feign

    private static final String RIBBON_URL = "http://user/user/getUserInfo";
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