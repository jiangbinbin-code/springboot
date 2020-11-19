package com.ghac.tusahre.module.zhishu.controller;


import com.ghac.tusahre.module.zhishu.service.IndexGlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:27
 */
@RestController
@RequestMapping("sys/indexglobal")
public class IndexGlobalController {
    @Autowired
    private IndexGlobalService indexGlobalService;

}
