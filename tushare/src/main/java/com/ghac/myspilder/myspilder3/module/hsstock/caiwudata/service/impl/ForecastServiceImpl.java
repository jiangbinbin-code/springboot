package com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.service.impl;

import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.dao.ForecastDao;
import org.springframework.stereotype.Service;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.service.ForecastService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.entity.ForecastEntity;

@Service("forecastService")
public class ForecastServiceImpl extends ServiceImpl<ForecastDao, ForecastEntity> implements ForecastService {

}
