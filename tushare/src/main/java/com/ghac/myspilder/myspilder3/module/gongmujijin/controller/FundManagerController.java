package com.ghac.myspilder.myspilder3.module.gongmujijin.controller;

import com.ghac.myspilder.myspilder3.module.gongmujijin.service.FundManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:44
 */
@RestController
@RequestMapping("sys/fundmanager")
public class FundManagerController {
    @Autowired
    private FundManagerService fundManagerService;



}