package com.ghac.myspilder.myspilder3.module.xinyejingji.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.TmtTwincomeService;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:05
 */
@RestController
@RequestMapping("sys/tmttwincome")
public class TmtTwincomeController {
    @Autowired
    private TmtTwincomeService tmtTwincomeService;


}
