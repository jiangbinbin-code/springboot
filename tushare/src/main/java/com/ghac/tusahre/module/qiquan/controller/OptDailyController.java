package com.ghac.tusahre.module.qiquan.controller;

import com.ghac.tusahre.module.qiquan.service.OptDailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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
