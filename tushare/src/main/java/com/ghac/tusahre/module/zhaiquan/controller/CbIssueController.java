package com.ghac.tusahre.module.zhaiquan.controller;


import com.ghac.tusahre.module.zhaiquan.service.CbIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:58:00
 */
@RestController
@RequestMapping("sys/cbissue")
public class CbIssueController {
    @Autowired
    private CbIssueService cbIssueService;


}
