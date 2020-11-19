package com.ghac.tusahre.module.hsstock.xqdata.controller;


import com.ghac.tusahre.module.hsstock.xqdata.service.BakDailyService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:05
 */
@RestController
@RequestMapping("sys/bakdaily")
public class BakDailyController {
    @Autowired
    private BakDailyService bakDailyService;


}
