package com.ghac.tusahre.module.waihui.controller;

import com.ghac.tusahre.module.waihui.service.FxObasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:39
 */
@RestController
@RequestMapping("sys/fxobasic")
public class FxObasicController {
    @Autowired
    private FxObasicService fxObasicService;


}
