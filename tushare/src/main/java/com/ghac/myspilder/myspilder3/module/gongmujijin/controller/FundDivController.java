package com.ghac.myspilder.myspilder3.module.gongmujijin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.FundDivService;


/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:44
 */
@RestController
@RequestMapping("sys/funddiv")
public class FundDivController {
    @Autowired
    private FundDivService fundDivService;



}
