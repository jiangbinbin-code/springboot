package com.ghac.myspilder.myspilder3.module.hsstock.xqdata.service.serviceImpl;

import com.ghac.myspilder.myspilder3.module.hsstock.xqdata.dao.MonthlyDao;
import com.ghac.myspilder.myspilder3.module.hsstock.xqdata.entity.MonthlyEntity;
import com.ghac.myspilder.myspilder3.module.hsstock.xqdata.service.MonthlyService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("monthlyService")
public class MonthlyServiceImpl extends ServiceImpl<MonthlyDao, MonthlyEntity> implements MonthlyService {


}
