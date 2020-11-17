package com.ghac.myspilder.myspilder3.module.hongguanjingjin.guoneihongguan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.CnPpiService;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:55
 */
@RestController
@RequestMapping("sys/cnppi")
public class CnPpiController {
    @Autowired
    private CnPpiService cnPpiService;



}
