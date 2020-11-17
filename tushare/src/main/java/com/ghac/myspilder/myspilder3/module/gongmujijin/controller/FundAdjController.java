package com.ghac.myspilder.myspilder3.module.gongmujijin.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.renren.modules.sys.entity.FundAdjEntity;
import io.renren.modules.sys.service.FundAdjService;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:47
 */
@RestController
@RequestMapping("sys/fundadj")
public class FundAdjController {
    @Autowired
    private FundAdjService fundAdjService;



}
