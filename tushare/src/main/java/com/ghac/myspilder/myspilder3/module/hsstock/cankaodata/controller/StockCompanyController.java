package com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.controller;

import com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.service.StockCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:10
 */
@RestController
@RequestMapping("sys/stockcompany")
public class StockCompanyController {
    @Autowired
    private StockCompanyService stockCompanyService;



}