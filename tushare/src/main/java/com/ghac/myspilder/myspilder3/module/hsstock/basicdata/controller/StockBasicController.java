package com.ghac.myspilder.myspilder3.module.hsstock.basicdata.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.service.StockBasicService;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:05
 */
@RestController
@RequestMapping("sys/stockbasic")
public class StockBasicController {
    @Autowired
    private StockBasicService stockBasicService;


}
