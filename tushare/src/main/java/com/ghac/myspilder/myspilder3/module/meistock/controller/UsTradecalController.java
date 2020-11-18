package com.ghac.myspilder.myspilder3.module.meistock.controller;


import com.ghac.myspilder.myspilder3.module.meistock.service.UsTradecalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:58
 */
@RestController
@RequestMapping("sys/ustradecal")
public class UsTradecalController {
    @Autowired
    private UsTradecalService usTradecalService;

}
