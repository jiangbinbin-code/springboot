package com.ghac.tusahre.module.hsstock.xqdata.controller;


import com.ghac.tusahre.module.hsstock.xqdata.service.GgtTop10Service;
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
@RequestMapping("sys/ggttop10")
public class GgtTop10Controller {
    @Autowired
    private GgtTop10Service ggtTop10Service;


}
