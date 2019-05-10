package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: ly
 * @date: 2019/5/10 10:21
 * <p>
 * 测试：http://127.0.0.1:8081/sales/queryGoodsList/1
 */
@RequestMapping("/sales")
public interface SalesRest {
    @RequestMapping(value = "/queryGoodsList/{type}", method = RequestMethod.GET)
    Object queryGoodsList(Integer type);
}
