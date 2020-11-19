package com.ghac.tusahre.module.hsstock.cankaodata.controller;


import com.ghac.tusahre.module.hsstock.cankaodata.service.Top10FloatholdersService;
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
@RequestMapping("sys/top10floatholders")
public class Top10FloatholdersController {
    @Autowired
    private Top10FloatholdersService top10FloatholdersService;



}
