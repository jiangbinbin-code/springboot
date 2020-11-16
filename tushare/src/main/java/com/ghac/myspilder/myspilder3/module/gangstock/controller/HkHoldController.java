package com.ghac.myspilder.myspilder3.module.gangstock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.HkHoldService;


/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:33
 */
@RestController
@RequestMapping("sys/hkhold")
public class HkHoldController {
    @Autowired
    private HkHoldService hkHoldService;


}
