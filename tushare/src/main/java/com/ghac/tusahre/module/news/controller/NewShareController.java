package com.ghac.tusahre.module.news.controller;


import com.ghac.tusahre.module.news.service.NewShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:16
 */
@RestController
@RequestMapping("sys/newshare")
public class NewShareController {
    @Autowired
    private NewShareService newShareService;

}
