package com.ghac.tusahre.module.hongguanjingjin.guoneihongguan.controller;


import com.ghac.tusahre.module.hongguanjingjin.guoneihongguan.service.WzIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:58
 */
@RestController
@RequestMapping("sys/wzindex")
public class WzIndexController {
    @Autowired
    private WzIndexService wzIndexService;


}
