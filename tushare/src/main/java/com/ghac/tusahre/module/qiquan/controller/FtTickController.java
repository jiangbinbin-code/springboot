package com.ghac.tusahre.module.qiquan.controller;


import com.ghac.tusahre.module.qiquan.service.FtTickService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:47
 */
@RestController
@RequestMapping("sys/fttick")
public class FtTickController {
    @Autowired
    private FtTickService ftTickService;


}
