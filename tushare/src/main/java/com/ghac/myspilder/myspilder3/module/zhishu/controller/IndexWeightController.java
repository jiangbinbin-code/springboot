package com.ghac.myspilder.myspilder3.module.zhishu.controller;


import com.ghac.myspilder.myspilder3.module.zhishu.service.IndexWeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:26
 */
@RestController
@RequestMapping("sys/indexweight")
public class IndexWeightController {
    @Autowired
    private IndexWeightService indexWeightService;


}
