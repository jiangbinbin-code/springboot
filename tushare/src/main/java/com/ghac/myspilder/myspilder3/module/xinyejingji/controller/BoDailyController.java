package com.ghac.myspilder.myspilder3.module.xinyejingji.controller;

import java.util.Map;

import com.ghac.myspilder.myspilder3.module.xinyejingji.service.BoDailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:04
 */
@RestController
@RequestMapping("sys/bodaily")
public class BoDailyController {
    @Autowired
    private BoDailyService boDailyService;


}