package com.demo.controller.impl;

import com.demo.controller.SalesRest;
import com.demo.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ly
 * @date: 2019/5/10 10:22
 */
@RestController
public class SalesRestImpl implements SalesRest {
    @Autowired
    private SalesService salesService;

    @Override
    public String queryGoodsList(@PathVariable Integer type) {
        System.out.println("start to queryGoodsList --->");
        if (type.intValue() == 1) {
            return salesService.queryGoodsListByRibbon();
        } else {
            return salesService.queryGoodsListByFeign();
        }
    }
}
