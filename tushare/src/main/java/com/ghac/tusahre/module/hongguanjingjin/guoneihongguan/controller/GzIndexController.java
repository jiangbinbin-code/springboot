package com.ghac.tusahre.module.hongguanjingjin.guoneihongguan.controller;

import com.ghac.tusahre.module.hongguanjingjin.guoneihongguan.service.GzIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:38
 */
@RestController
@RequestMapping("sys/gzindex")
public class GzIndexController {
    @Autowired
    private GzIndexService gzIndexService;


}
