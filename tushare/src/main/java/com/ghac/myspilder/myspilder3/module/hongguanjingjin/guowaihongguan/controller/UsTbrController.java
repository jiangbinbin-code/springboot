package com.ghac.myspilder.myspilder3.module.hongguanjingjin.guowaihongguan.controller;

import com.ghac.myspilder.myspilder3.module.hongguanjingjin.guowaihongguan.service.UsTbrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:59
 */
@RestController
@RequestMapping("sys/ustbr")
public class UsTbrController {
    @Autowired
    private UsTbrService usTbrService;


}
