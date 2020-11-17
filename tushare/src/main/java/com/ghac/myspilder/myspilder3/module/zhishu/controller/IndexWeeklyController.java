package com.ghac.myspilder.myspilder3.module.zhishu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.IndexWeeklyService;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:26
 */
@RestController
@RequestMapping("sys/indexweekly")
public class IndexWeeklyController {
    @Autowired
    private IndexWeeklyService indexWeeklyService;


}
