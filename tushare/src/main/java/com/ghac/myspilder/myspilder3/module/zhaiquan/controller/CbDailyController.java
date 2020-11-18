package com.ghac.myspilder.myspilder3.module.zhaiquan.controller;


import com.ghac.myspilder.myspilder3.module.zhaiquan.service.CbDailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:59
 */
@RestController
@RequestMapping("sys/cbdaily")
public class CbDailyController {
    @Autowired
    private CbDailyService cbDailyService;

}
