package com.ghac.myspilder.myspilder3.module.hongguanjingjin.guoneihongguan.controller;


import com.ghac.myspilder.myspilder3.module.hongguanjingjin.guoneihongguan.service.LiborService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:26
 */
@RestController
@RequestMapping("sys/libor")
public class LiborController {
    @Autowired
    private LiborService liborService;


}
