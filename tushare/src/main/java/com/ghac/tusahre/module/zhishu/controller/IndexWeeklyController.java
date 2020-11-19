package com.ghac.tusahre.module.zhishu.controller;

import com.ghac.tusahre.module.zhishu.service.IndexWeeklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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
