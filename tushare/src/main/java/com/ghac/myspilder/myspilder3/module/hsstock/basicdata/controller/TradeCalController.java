package com.ghac.myspilder.myspilder3.module.hsstock.basicdata.controller;

import com.ghac.myspilder.myspilder3.module.hsstock.basicdata.service.TradeCalService;
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
@RequestMapping("sys/tradecal")
public class TradeCalController {
    @Autowired
    private TradeCalService tradeCalService;

}