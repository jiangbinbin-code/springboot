package com.ghac.tusahre.module.hongguanjingjin.guowaihongguan.controller;


import com.ghac.tusahre.module.hongguanjingjin.guowaihongguan.service.UsTltrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:56:59
 */
@RestController
@RequestMapping("sys/ustltr")
public class UsTltrController {
    @Autowired
    private UsTltrService usTltrService;

}
