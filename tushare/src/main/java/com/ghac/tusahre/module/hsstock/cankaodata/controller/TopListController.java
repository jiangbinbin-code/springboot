package com.ghac.tusahre.module.hsstock.cankaodata.controller;



import com.ghac.tusahre.module.hsstock.cankaodata.service.TopListService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:04
 */
@RestController
@RequestMapping("sys/toplist")
public class TopListController {
    @Autowired
    private TopListService topListService;


}
