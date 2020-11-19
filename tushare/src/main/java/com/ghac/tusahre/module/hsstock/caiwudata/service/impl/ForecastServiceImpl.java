package com.ghac.tusahre.module.hsstock.caiwudata.service.impl;

import com.ghac.tusahre.module.hsstock.caiwudata.dao.ForecastDao;
import com.ghac.tusahre.module.hsstock.caiwudata.entity.ForecastEntity;
import com.ghac.tusahre.module.hsstock.caiwudata.service.ForecastService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("forecastService")
public class ForecastServiceImpl extends ServiceImpl<ForecastDao, ForecastEntity> implements ForecastService {

}
