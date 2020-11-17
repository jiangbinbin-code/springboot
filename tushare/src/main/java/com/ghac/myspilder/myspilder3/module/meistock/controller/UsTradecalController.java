package com.ghac.myspilder.myspilder3.module.meistock.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.service.UsTradecalService;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:58
 */
@RestController
@RequestMapping("sys/ustradecal")
public class UsTradecalController {
    @Autowired
    private UsTradecalService usTradecalService;

}
