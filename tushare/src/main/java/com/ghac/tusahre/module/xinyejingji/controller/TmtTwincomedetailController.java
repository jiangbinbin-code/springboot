package com.ghac.tusahre.module.xinyejingji.controller;


import com.ghac.tusahre.module.xinyejingji.service.TmtTwincomedetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:05
 */
@RestController
@RequestMapping("sys/tmttwincomedetail")
public class TmtTwincomedetailController {
    @Autowired
    private TmtTwincomedetailService tmtTwincomedetailService;


}
