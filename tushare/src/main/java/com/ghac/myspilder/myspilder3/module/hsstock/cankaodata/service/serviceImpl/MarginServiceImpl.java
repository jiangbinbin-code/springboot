package com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.service.serviceImpl;

import com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.dao.MarginDao;
import com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.entity.MarginEntity;
import com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.service.MarginService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("marginService")
public class MarginServiceImpl extends ServiceImpl<MarginDao, MarginEntity> implements MarginService {


}
