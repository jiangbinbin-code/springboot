package com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.controller;


import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.service.FinaMainbzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:48
 */
@RestController
@RequestMapping("sys/finamainbz")
public class FinaMainbzController {
    @Autowired
    private FinaMainbzService finaMainbzService;


}
