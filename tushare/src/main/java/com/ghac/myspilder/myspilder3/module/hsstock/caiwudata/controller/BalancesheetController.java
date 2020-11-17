package com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.BalancesheetService;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:00
 */
@RestController
@RequestMapping("sys/balancesheet")
public class BalancesheetController {
    @Autowired
    private BalancesheetService balancesheetService;


}
