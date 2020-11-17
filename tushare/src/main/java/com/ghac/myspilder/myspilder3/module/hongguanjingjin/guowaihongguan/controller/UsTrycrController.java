package com.ghac.myspilder.myspilder3.module.hongguanjingjin.guowaihongguan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.service.UsTrycrService;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:58
 */
@RestController
@RequestMapping("sys/ustrycr")
public class UsTrycrController {
    @Autowired
    private UsTrycrService usTrycrService;



}
