package com.ghac.myspilder.myspilder3.module.qihuo.controller;

import com.ghac.myspilder.myspilder3.module.qihuo.service.FutHoldingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:39
 */
@RestController
@RequestMapping("sys/futholding")
public class FutHoldingController {
    @Autowired
    private FutHoldingService futHoldingService;


}
