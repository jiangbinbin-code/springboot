package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.DailyDao;
import io.renren.modules.sys.entity.DailyEntity;
import io.renren.modules.sys.service.DailyService;


@Service("dailyService")
public class DailyServiceImpl extends ServiceImpl<DailyDao, DailyEntity> implements DailyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DailyEntity> page = this.page(
                new Query<DailyEntity>().getPage(params),
                new QueryWrapper<DailyEntity>()
        );

        return new PageUtils(page);
    }

}
