package com.ghac.myspilder.myspilder3.module.gongmujijin.controller;

import com.ghac.myspilder.myspilder3.module.gongmujijin.service.FundPortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:43
 */
@RestController
@RequestMapping("sys/fundportfolio")
public class FundPortfolioController {
    @Autowired
    private FundPortfolioService fundPortfolioService;



}
