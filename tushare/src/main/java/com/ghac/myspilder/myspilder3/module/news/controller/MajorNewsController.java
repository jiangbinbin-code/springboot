package com.ghac.myspilder.myspilder3.module.news.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.MajorNewsService;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:20
 */
@RestController
@RequestMapping("sys/majornews")
public class MajorNewsController {
    @Autowired
    private MajorNewsService majorNewsService;

}
