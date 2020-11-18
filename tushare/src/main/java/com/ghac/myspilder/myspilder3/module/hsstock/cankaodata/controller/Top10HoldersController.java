package com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.controller;


import com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.service.Top10HoldersService;
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
@RequestMapping("sys/top10holders")
public class Top10HoldersController {
    @Autowired
    private Top10HoldersService top10HoldersService;


}
