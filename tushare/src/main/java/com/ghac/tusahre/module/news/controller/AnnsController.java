package com.ghac.tusahre.module.news.controller;


import com.ghac.tusahre.module.news.service.AnnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:04
 */
@RestController
@RequestMapping("sys/anns")
public class AnnsController {
    @Autowired
    private AnnsService annsService;


}
