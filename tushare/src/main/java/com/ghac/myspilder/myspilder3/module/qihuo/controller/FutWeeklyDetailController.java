package com.ghac.myspilder.myspilder3.module.qihuo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.FutWeeklyDetailService;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:38
 */
@RestController
@RequestMapping("sys/futweeklydetail")
public class FutWeeklyDetailController {
    @Autowired
    private FutWeeklyDetailService futWeeklyDetailService;



}