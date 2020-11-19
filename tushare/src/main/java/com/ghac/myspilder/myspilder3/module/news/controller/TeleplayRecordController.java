package com.ghac.myspilder.myspilder3.module.news.controller;



import com.ghac.myspilder.myspilder3.module.news.service.TeleplayRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:04
 */
@RestController
@RequestMapping("sys/teleplayrecord")
public class TeleplayRecordController {
    @Autowired
    private TeleplayRecordService teleplayRecordService;


}
