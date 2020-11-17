package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.dao.IncomeDao;
import com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.service.IncomeService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import io.renren.modules.sys.entity.IncomeEntity;


@Service("forecastService")
public class ForecastServiceImpl extends ServiceImpl<ForecastDao, ForecastEntity> implements ForecastService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ForecastEntity> page = this.page(
                new Query<ForecastEntity>().getPage(params),
                new QueryWrapper<ForecastEntity>()
        );

        return new PageUtils(page);
    }

}
