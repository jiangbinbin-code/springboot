package com.ghac.myspilder.myspilder3.module.zhishu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.IndexClassifyService;


/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:27
 */
@RestController
@RequestMapping("sys/indexclassify")
public class IndexClassifyController {
    @Autowired
    private IndexClassifyService indexClassifyService;


}
