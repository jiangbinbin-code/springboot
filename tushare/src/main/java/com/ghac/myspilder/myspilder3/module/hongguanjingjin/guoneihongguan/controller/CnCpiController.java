package com.ghac.myspilder.myspilder3.module.hongguanjingjin.guoneihongguan.controller;

import com.ghac.myspilder.myspilder3.module.hongguanjingjin.guoneihongguan.service.CnCpiService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:59
 */
@RestController
@RequestMapping("sys/cncpi")
public class CnCpiController {
    @Autowired
    private CnCpiService cnCpiService;


}
