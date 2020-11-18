package com.ghac.myspilder.myspilder3.module.hsstock.xqdata.controller;


import com.ghac.myspilder.myspilder3.module.hsstock.xqdata.service.LimitListService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:20
 */
@RestController
@RequestMapping("sys/limitlist")
public class LimitListController {
    @Autowired
    private LimitListService limitListService;

}
