package com.ghac.tusahre.module.hsstock.basicdata.controller;

import com.ghac.tusahre.module.hsstock.basicdata.service.StkRewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:05
 */
@RestController
@RequestMapping("sys/stkrewards")
public class StkRewardsController {
    @Autowired
    private StkRewardsService stkRewardsService;


}
