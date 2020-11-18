package com.ghac.myspilder.myspilder3.module.zhaiquan.controller;


import com.ghac.myspilder.myspilder3.module.zhaiquan.service.EcoCalService;
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
@RequestMapping("sys/ecocal")
public class EcoCalController {
    @Autowired
    private EcoCalService ecoCalService;


}
