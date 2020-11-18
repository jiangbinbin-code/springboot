package com.ghac.myspilder.myspilder3.module.qiquan.controller;


import com.ghac.myspilder.myspilder3.module.qiquan.service.OptBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:19
 */
@RestController
@RequestMapping("sys/optbasic")
public class OptBasicController {
    @Autowired
    private OptBasicService optBasicService;


}
