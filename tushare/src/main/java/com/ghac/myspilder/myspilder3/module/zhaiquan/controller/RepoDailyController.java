package com.ghac.myspilder.myspilder3.module.zhaiquan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.RepoDailyService;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:16
 */
@RestController
@RequestMapping("sys/repodaily")
public class RepoDailyController {
    @Autowired
    private RepoDailyService repoDailyService;



}
