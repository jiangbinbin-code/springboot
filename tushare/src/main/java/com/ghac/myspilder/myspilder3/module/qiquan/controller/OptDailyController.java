package com.ghac.myspilder.myspilder3.module.qiquan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.OptDailyService;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:19
 */
@RestController
@RequestMapping("sys/optdaily")
public class OptDailyController {
    @Autowired
    private OptDailyService optDailyService;


}
