package com.ghac.tusahre.module.hsstock.caiwudata.controller;


import com.ghac.tusahre.module.hsstock.caiwudata.service.DividendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:49
 */
@RestController
@RequestMapping("sys/dividend")
public class DividendController {
    @Autowired
    private DividendService dividendService;


}
