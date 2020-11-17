package com.ghac.myspilder.myspilder3.module.xinyejingji.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.BoCinemaService;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:04
 */
@RestController
@RequestMapping("sys/bocinema")
public class BoCinemaController {
    @Autowired
    private BoCinemaService boCinemaService;



}
