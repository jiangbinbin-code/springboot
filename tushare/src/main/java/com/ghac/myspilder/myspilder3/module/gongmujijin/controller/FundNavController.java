package com.ghac.myspilder.myspilder3.module.gongmujijin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.service.FundNavService;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:43
 */
@RestController
@RequestMapping("sys/fundnav")
public class FundNavController {
    @Autowired
    private FundNavService fundNavService;


}
