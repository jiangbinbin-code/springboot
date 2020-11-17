package com.ghac.myspilder.myspilder3.module.news.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.CctvNewsService;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:59
 */
@RestController
@RequestMapping("sys/cctvnews")
public class CctvNewsController {
    @Autowired
    private CctvNewsService cctvNewsService;



}
