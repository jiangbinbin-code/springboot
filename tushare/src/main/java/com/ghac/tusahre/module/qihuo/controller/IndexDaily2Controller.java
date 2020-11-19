package com.ghac.tusahre.module.qihuo.controller;

import com.ghac.tusahre.module.qihuo.service.IndexDaily2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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
