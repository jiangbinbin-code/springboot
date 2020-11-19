package com.ghac.tusahre.module.qihuo.controller;

import com.ghac.tusahre.module.qihuo.service.FutWeeklyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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
