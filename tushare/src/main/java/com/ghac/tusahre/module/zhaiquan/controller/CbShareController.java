package com.ghac.tusahre.module.zhaiquan.controller;


import com.ghac.tusahre.module.zhaiquan.service.CbShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:59
 */
@RestController
@RequestMapping("sys/cbshare")
public class CbShareController {
    @Autowired
    private CbShareService cbShareService;


}
