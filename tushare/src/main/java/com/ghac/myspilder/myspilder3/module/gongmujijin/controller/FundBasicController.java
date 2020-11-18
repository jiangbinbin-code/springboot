package com.ghac.myspilder.myspilder3.module.gongmujijin.controller;


import com.ghac.myspilder.myspilder3.module.gongmujijin.service.FundBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:48
 */
@RestController
@RequestMapping("sys/fundbasic")
public class FundBasicController {
    @Autowired
    private FundBasicService fundBasicService;


}
