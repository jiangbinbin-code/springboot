package com.ghac.myspilder.myspilder3.module.xinyejingji.controller;


import com.ghac.myspilder.myspilder3.module.xinyejingji.service.BoWeeklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:00
 */
@RestController
@RequestMapping("sys/boweekly")
public class BoWeeklyController {
    @Autowired
    private BoWeeklyService boWeeklyService;



}
