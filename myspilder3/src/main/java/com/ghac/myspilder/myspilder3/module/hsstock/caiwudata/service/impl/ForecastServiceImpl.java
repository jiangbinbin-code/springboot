package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ForecastDao;
import io.renren.modules.sys.entity.ForecastEntity;
import io.renren.modules.sys.service.ForecastService;


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
