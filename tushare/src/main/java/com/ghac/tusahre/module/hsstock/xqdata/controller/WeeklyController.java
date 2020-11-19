package com.ghac.tusahre.module.hsstock.xqdata.controller;


import com.ghac.tusahre.module.hsstock.xqdata.service.WeeklyService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:58
 */
@RestController
@RequestMapping("sys/weekly")
public class WeeklyController {
    @Autowired
    private WeeklyService weeklyService;



}
