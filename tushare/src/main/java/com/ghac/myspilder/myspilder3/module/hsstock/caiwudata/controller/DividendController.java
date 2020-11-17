package com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.service.DividendService;


/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:49
 */
@RestController
@RequestMapping("sys/dividend")
public class DividendController {
    @Autowired
    private DividendService dividendService;


}
