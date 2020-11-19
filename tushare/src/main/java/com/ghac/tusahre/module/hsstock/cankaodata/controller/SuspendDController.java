package com.ghac.tusahre.module.hsstock.cankaodata.controller;


import com.ghac.tusahre.module.hsstock.cankaodata.service.SuspendDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:10
 */
@RestController
@RequestMapping("sys/suspendd")
public class SuspendDController {
    @Autowired
    private SuspendDService suspendDService;

}
