package com.ghac.myspilder.myspilder3.module.hsstock.xqdata.controller;


import com.ghac.myspilder.myspilder3.module.hsstock.xqdata.service.DailyService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:54
 */
@RestController
@RequestMapping("sys/daily")
public class DailyController {
    @Autowired
    private DailyService dailyService;

}
