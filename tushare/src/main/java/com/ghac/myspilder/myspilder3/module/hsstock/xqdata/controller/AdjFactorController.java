package com.ghac.myspilder.myspilder3.module.hsstock.xqdata.controller;


import com.ghac.myspilder.myspilder3.module.hsstock.xqdata.service.AdjFactorService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:04
 */
@RestController
@RequestMapping("sys/adjfactor")
public class AdjFactorController {
    @Autowired
    private AdjFactorService adjFactorService;


}
