package com.ghac.myspilder.myspilder3.module.hongguanjingjin.guowaihongguan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.UsTltrService;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:59
 */
@RestController
@RequestMapping("sys/ustltr")
public class UsTltrController {
    @Autowired
    private UsTltrService usTltrService;

}
