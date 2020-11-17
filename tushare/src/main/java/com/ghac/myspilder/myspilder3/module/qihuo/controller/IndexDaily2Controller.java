package com.ghac.myspilder.myspilder3.module.qihuo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.IndexDaily2Service;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:32
 */
@RestController
@RequestMapping("sys/indexdaily2")
public class IndexDaily2Controller {
    @Autowired
    private IndexDaily2Service indexDaily2Service;


}
