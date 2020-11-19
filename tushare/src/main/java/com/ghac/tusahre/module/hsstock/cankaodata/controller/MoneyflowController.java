package com.ghac.tusahre.module.hsstock.cankaodata.controller;

import com.ghac.tusahre.module.hsstock.cankaodata.service.MoneyflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:20
 */
@RestController
@RequestMapping("sys/moneyflow")
public class MoneyflowController {
    @Autowired
    private MoneyflowService moneyflowService;

}
