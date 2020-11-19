package com.ghac.tusahre.module.zhishu.controller;


import com.ghac.tusahre.module.hsstock.xqdata.service.DailyService;
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
@RequestMapping("sys/dailyinfo")
public class DailyInfoController {
    @Autowired
    private DailyService dailyInfoService;


}
